package cake

import  kotlin.math.max
import kotlin.math.min

fun getMaxProfit(stockPrices: IntArray): Int {
    if (stockPrices.size < 2) {
        throw Exception("Get maximum profit requires at least 2 prices")
    }
    var maxProfit = stockPrices[1] - stockPrices[0]
    var minPrice = stockPrices.first()

    for (i in 1 until stockPrices.size) {
        val currentPrice = stockPrices[i]

        val potentialProfit = currentPrice - minPrice

        minPrice = min(minPrice, currentPrice)

        maxProfit = max(maxProfit, potentialProfit)
    }
    return maxProfit
}

fun main(args: Array<String>) {
    println(getMaxProfit(intArrayOf(10, 7, 5, 8, 11, 9, 4, 20)))
    println(getMaxProfit(intArrayOf(10, 9)))
}