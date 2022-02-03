package leetcode.arrays

import kotlin.math.max

/**
 * Best Time to Buy and Sell Stock II
 *
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 *
 *
 * @param prices the daily prices of the stock
 * @return maximum profit you can achieve
 *
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/">Best Time to Buy and Sell Stock II</a>
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
