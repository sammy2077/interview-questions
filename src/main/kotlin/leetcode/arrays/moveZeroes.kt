package leetcode.arrays

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/">Leetcode</a>
 */
fun moveZeroes(nums: IntArray): IntArray {
    var index = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[i] = nums[index].also { nums[index] = nums[i] }
            index++
        }
    }
    return nums
}