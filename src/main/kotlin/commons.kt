fun canSum(targetSum: Int, items: IntArray): Boolean {
    if (targetSum == 0) return true
    if (targetSum < 0) return false

    for (item in items) {
        val remainder = targetSum - item
        if (canSum(remainder, items.filter { it != item }.toIntArray())) {
            return true
        }
    }
    return false
}

fun countTestCases(n: Int, time: Int = 24): Int {
    val weekly = n / time
    println("Testcases every sprint - $weekly")
    val dp = IntArray(time + 1)
    dp[1] = weekly
    for (i in 2..time) {
        dp[i] = weekly + dp[i - 1]
        println("Week $i => ${dp[i]}")
    }
    return dp.sum()
}

fun main() {
    println(canSum(7, intArrayOf(2, 6)))
    println(canSum(7, intArrayOf(2, 3, 7)))
    println(canSum(7, intArrayOf(4, 3)))
    println(countTestCases(4100))
    println(countTestCases(4800))
}