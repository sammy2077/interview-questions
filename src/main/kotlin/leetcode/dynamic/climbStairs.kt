package leetcode.dynamic

fun climbStairs(n: Int): Int {
    if (n <= 1) {
        return 1;
    }
    val ways = IntArray(n + 1)
    ways[0] = 1
    ways[1] = 1
    for (i in 2..n) {
        ways[i] = ways[i - 1] + ways[i - 2]
    }
    return ways[n]
}


fun main() {
    println(climbStairs(2))
    println(climbStairs(3))
    println(climbStairs(5))
}