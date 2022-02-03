package cake

/**
 * Binary Search Implementation
 *
 * @param nums The sorted array to search
 * @param target The item we are looking for
 * @return the index of the [target] in [nums], when not found -1
 */
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
