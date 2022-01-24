package leetcode.arrays

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/">Leetcode</a>
 */
fun removeDuplicates(nums: IntArray): Int {
    if (nums.size < 2) {
        return nums.size
    }
    var index = 1
    for (i in 0 until nums.size - 1) {
        if (nums[i] != nums[i + 1]) {
            nums[index++] = nums[i + 1]
        }
    }
    return index
}