package leetcode.trees

import java.util.LinkedList

fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) {
        return true
    }
    val q = LinkedList<TreeNode?>()

    q.add(root.left)
    q.add(root.right)

    while (!q.isEmpty()) {
        val tempLeft = q.remove()
        val tempRight = q.remove()

        if (tempLeft == null && tempRight == null) continue

        if (tempLeft == null || tempRight == null || tempRight.`val` != tempLeft.`val`) {
            return false
        }
        q.add(tempLeft.left)
        q.add(tempRight.right)
        q.add(tempLeft.right)
        q.add(tempRight.left)
    }
    return true
}
