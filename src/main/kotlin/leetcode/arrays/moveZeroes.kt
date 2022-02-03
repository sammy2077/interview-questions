package leetcode.arrays

/**
 * Move Zeroes
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * *Note*: that you must do this in-place without making a copy of the array.
 *
 * @param nums the input array
 *
 * @return the result
 *
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/">Move Zeroes</a>
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
