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


fun main() {
    println(canSum(7, intArrayOf(2, 6)))
    println(canSum(7, intArrayOf(2, 3, 7)))
    println(canSum(7, intArrayOf(4, 3)))
}