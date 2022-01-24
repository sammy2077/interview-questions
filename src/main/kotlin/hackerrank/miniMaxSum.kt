package hackerrank

import kotlin.math.max
import kotlin.math.min

fun miniMaxSum(arr: IntArray): Unit {
    var maxValue = Int.MIN_VALUE
    var minValue = Int.MAX_VALUE

    var sum = 0L
    for (item in arr) {
        sum += item
        maxValue = max(maxValue, item)
        minValue = min(minValue, item)
    }
    println("${sum - maxValue} ${sum - minValue}")

}

fun main() {
    miniMaxSum(intArrayOf(1, 0, -3, 4, 5))
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
    println(UInt.MIN_VALUE)
    println(UInt.MAX_VALUE)
}