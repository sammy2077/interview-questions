package leetcode.trees

import java.util.Stack

data class Node(val data: Int, val left: Node? = null, val right: Node? = null)

fun isValidBST(rootNode: Node?): Boolean {
    val stack = Stack<Node>()
    var minimumValue: Int? = null

    var currentNode = rootNode

    while (!stack.isEmpty() || currentNode != null) {
        while (currentNode != null) {
            stack.push(currentNode)
            currentNode = currentNode.left
        }
        currentNode = stack.pop()
        minimumValue?.let { v ->
            if (currentNode!!.data <= v) return false
        }
        minimumValue = currentNode.data
        currentNode = currentNode.right
    }
    return true
}

fun main() {
    val tree = Node(5, Node(1), Node(7, Node(6), Node(8)))

    println(isValidBST(tree))
}
