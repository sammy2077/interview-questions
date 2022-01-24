package hackerrank

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Computes the division and return a BigDecimal with the provided scale
 */
private fun Int.divideAndKeepPrecision(divisor: Int, scale: Int = 6): BigDecimal =
    this.toBigDecimal().divide(divisor.toBigDecimal(), scale, RoundingMode.HALF_UP)

fun plusMinus(arr: IntArray): Unit {
    var positives = 0
    var zeros = 0
    var negatives = 0
    for (item in arr) {
        when {
            item > 0 -> positives++
            item == 0 -> zeros++
            else -> negatives++
        }
    }
    println(positives.divideAndKeepPrecision(arr.size))
    println(negatives.divideAndKeepPrecision(arr.size))
    println(zeros.divideAndKeepPrecision(arr.size))
}

fun main() {
    plusMinus(intArrayOf(-4, 3, -9, 0, 4, 1))
}