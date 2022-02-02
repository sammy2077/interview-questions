package hackerrank

import kotlin.math.min

fun maxMin(k: Int, arr: Array<Int>): Int {
    var minMax = Int.MAX_VALUE
    arr.sort()
    var j = k - 1
    for (i in 0..arr.size - k) {
        val min = arr[i]
        val max = arr[j++]
        minMax = min(max - min, minMax)
    }
    return minMax
}
