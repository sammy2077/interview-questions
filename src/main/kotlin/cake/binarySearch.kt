package cake


fun binarySearch(nums: IntArray, target: Int): Int {
    var floorIndex = -1
    var ceilingIndex: Int = nums.size
    while (floorIndex + 1 < ceilingIndex) {
        val distance = ceilingIndex - floorIndex
        val halfDistance = distance / 2
        val guessIndex = floorIndex + halfDistance
        val guessValue = nums[guessIndex]
        if (guessValue == target) return guessIndex
        if (guessValue > target) {
            ceilingIndex = guessIndex
        } else {
            floorIndex = guessIndex
        }
    }

    return -1

}

fun main() {
    println(binarySearch(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11), 11))
}