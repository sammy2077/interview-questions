package leetcode.dynamic

fun maxProfit(prices: IntArray): Int {
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