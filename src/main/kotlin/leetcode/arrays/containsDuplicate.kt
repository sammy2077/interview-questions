package leetcode.arrays

/**
 * Contains Duplicate
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * @param nums the input array
 *
 * @return true or false
 *
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/">Contains Duplicate</a>
 */
fun containsDuplicate(nums: IntArray): Boolean {
    if (nums.size < 2) {
        return false
    }
    val map = HashSet<Int>()
    for (item in nums) {
        if (item in map) {
            return true
        }
        map.add(item)
    }
    return false
}
