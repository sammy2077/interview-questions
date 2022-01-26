package leetcode.dynamic

import kotlin.math.max


fun maxSubArray(nums: IntArray): Int {
    var max = nums.firstOrNull() ?: 0
    var sum = 0
    for (element in nums) {
        sum += element
        max = max(sum, max)
        if (sum < 0) sum = 0
    }
    return max

}

fun main() {
    println(maxSubArray(intArrayOf(1, 2)))
    println(maxSubArray(intArrayOf(1, 2, -6, 7)))
    println(maxSubArray(intArrayOf()))
}