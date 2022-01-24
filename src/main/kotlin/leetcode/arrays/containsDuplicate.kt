package leetcode.arrays

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/">Leetcode</a>
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