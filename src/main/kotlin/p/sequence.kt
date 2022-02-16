package p

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.Callable
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.atomic.AtomicLong

interface SequenceGenerator {
    fun getNext(): Long
}

class SafeSequenceGenerator : SequenceGenerator {
    private var value = AtomicLong(1)

    @Synchronized
    override fun getNext(): Long {
        return value.getAndIncrement()
    }
}

fun main() = runBlocking {
    val sequenceGenerator = SafeSequenceGenerator()
    launch {
        println("lb exec ${sequenceGenerator.getNext()}")
        delay(1000L)
        println("la exec ${sequenceGenerator.getNext()}")
    }
    suspend fun suspendedFunction() {
        println("clb exec ${sequenceGenerator.getNext()}")
        delay(1000L)
        println("cla exec ${sequenceGenerator.getNext()}")
    }
    launch { suspendedFunction() }
    println("Start exec ${sequenceGenerator.getNext()}")

    val executor = Executors.newCachedThreadPool()

    try {
        val task1: Callable<List<Long>> = PrintSequenceCallable(sequenceGenerator)
        val task2: Callable<List<Long>> = PrintSequenceCallable(sequenceGenerator)
        val task3: Callable<List<Long>> = PrintSequenceCallable(sequenceGenerator)
        val f1: Future<*> = executor.submit(task1)
        val f2: Future<*> = executor.submit(task2)
        val f3: Future<*> = executor.submit(task3)
        println(
            withContext(Dispatchers.IO) {
                f1.get()
            }
        )
        println(
            withContext(Dispatchers.IO) {
                f2.get()
            }
        )
        println(
            withContext(Dispatchers.IO) {
                f3.get()
            }
        )
    } catch (e: InterruptedException) {
        e.printStackTrace()
    } catch (e: ExecutionException) {
        e.printStackTrace()
    } finally {
        executor.shutdown()
    }
}
