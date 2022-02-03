package cake

import kotlin.math.max
import kotlin.math.min

/**
 * Get Maximum Profit from stock sales
 *
 * *NOTE* Only one transaction allowed
 *
 * @param stockPrices the daily stock prices
 *
 * @return the maximum profit
 *
 * @throws Exception when [stockPrices] does not include more than one item. Remember we have to buy and sell
 */
@Throws(Exception::class)
fun getMaxProfit(stockPrices: IntArray): Int {
    if (stockPrices.size < 2) throw Exception("Get maximum profit requires at least 2 prices")
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
