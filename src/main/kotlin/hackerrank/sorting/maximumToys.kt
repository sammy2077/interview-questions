package hackerrank.sorting

/**
 * Mark and Toys
 *
 * Mark and Jane are very happy after having their first child.
 * Their son loves toys, so Mark wants to buy some.
 * There are a number of different toys lying in front of him, tagged with their prices.
 * Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
 * Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.
 *
 * Note Each toy can be purchased only once.
 *
 * @param prices The toy prices
 * @param k Mark's budget
 * @return The maximum number of toys
 *
 * @see <a href="https://www.hackerrank.com/challenges/mark-and-toys">Mark and Toys</a
 */
fun maximumToys(prices: IntArray, k: Int): Int {
    prices.sort()
    var count = 0
    var remainingCash = k
    for (i in prices.indices) {
        if (remainingCash < prices[i]) {
            return count
        }
        count++
        remainingCash -= prices[i]
    }
    return count
}
