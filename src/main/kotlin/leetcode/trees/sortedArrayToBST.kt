package leetcode.trees

import kotlin.math.ceil

fun sortedArrayToBST(nums: IntArray, start: Int = 0, end: Int = nums.size - 1): TreeNode? {
    return if (start > end) {
        null
    } else if (start == end) {
        TreeNode(nums[start])
    } else {
        val range = start + end
        val mid = if (range % 2 == 0) range / 2 else (range + 1) / 2
        val root = TreeNode(nums[mid])
        root.left = sortedArrayToBST(nums, start, mid - 1)
        root.right = sortedArrayToBST(nums, mid + 1, end)
        root
    }
}

fun main() {
//    println(sortedArrayToBST(intArrayOf(1, 2, 3, 4, 5, 6, 7)))
    println(sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
}