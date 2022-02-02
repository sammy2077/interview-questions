package leetcode.trees

import kotlin.math.max

data class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun maxDepth(root: TreeNode?): Int {
    return if (root == null) {
        0
    } else {
        1 + max(maxDepth(root.left), maxDepth(root.right))
    }
}
