package leetcode.arrays

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/">Leetcode</a>
 */
fun rotateArray(nums: IntArray, k: Int): IntArray {
    val rotations = k % nums.size
    var count = 0
    var start = 0
    while (count < nums.size) {
        var current = start
        var prev = nums[start]
        do {
            val next = (current + rotations) % nums.size
            val temp = nums[next]
            nums[next] = prev
            prev = temp
            current = next
            count++
        } while (start != current)
        start++
    }
    return nums
}
