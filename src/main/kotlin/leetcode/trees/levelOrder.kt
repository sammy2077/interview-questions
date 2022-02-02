package leetcode.trees

import java.util.*

fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) {
        return listOf()
    }
    val result = mutableListOf(listOf(root.`val`))

    val queue: Queue<TreeNode?> = LinkedList()

    queue.add(root)
    while (!queue.isEmpty()) {
        val current = queue.remove() ?: continue
        val level = mutableListOf<Int>()
        current.let {
            level.add(it.`val`)
            queue.add(it.left)
            queue.add(it.right)
        }
        result.add(level)
    }
    return result
}

fun main() {
    val tree = TreeNode(5)
}
