package hackerrank

import kotlin.math.pow

fun flippingBits(n: Long): Long = 2.0.pow(32.0).toLong() + n.inv()
fun main() {
    println(flippingBits(9))
}
