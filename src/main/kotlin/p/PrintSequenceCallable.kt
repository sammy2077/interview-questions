package p

import java.util.concurrent.Callable

class PrintSequenceCallable(private val sequenceGenerator: SequenceGenerator) :
    Callable<List<Long>> {
    @Throws(Exception::class)
    override fun call(): List<Long> {
        val ids: MutableList<Long> = ArrayList()
        for (i in 1..10) {
            Thread.sleep((100 * i).toLong()) // take a nap
            ids.add(sequenceGenerator.getNext())
        }
        return ids
    }
}
