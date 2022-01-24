package leetcode.arrays

import kotlin.math.max


/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/">Leetcode</a>
 */
fun maxProfit(prices: IntArray): Int {
    val n = prices.size
    if (n < 2) {
        return 0
    }
    val profit = IntArray(n + 1).apply { fill(0) }

    var prevDiff = Int.MIN_VALUE
    for (i in 1 until n) {
        prevDiff = max(prevDiff, profit[i - 1] - prices[i - 1])
        profit[i] = max(profit[i - 1], prices[i] + prevDiff)
    }
    return profit[n - 1]
}

fun maxProfitBuyOnce(prices: IntArray): Int {
    if (prices.isEmpty()) return 0
    var minPrice = prices.first()
    var maxProfit = 0
    for (price in prices) {
        if (price < minPrice) {
            minPrice = price
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice
        }
    }
    return maxProfit
}