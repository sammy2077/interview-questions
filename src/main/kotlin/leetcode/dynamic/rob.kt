package leetcode.dynamic

import kotlin.math.max

fun rob(nums: IntArray): Int {
    val n = nums.size
    if (n == 1) {
        return nums[0]
    }
    val dp = IntArray(n )
    dp[0] = nums[0]
    dp[1] = max(nums[0], nums[1])

    for (i in 2 until n) {
        dp[i] = max(dp[i - 2] + nums[i], dp[i - 1])
    }
    return dp[n - 1]
}

fun main() {
    println(rob(intArrayOf(10, 1, 4, 90)))
}