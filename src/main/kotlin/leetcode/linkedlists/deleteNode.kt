package leetcode.linkedlists

fun deleteNode(node: ListNode?) {
    val nextNode = node!!.next
    val subsequentNode = nextNode?.next
    node.`val` = nextNode!!.`val`
    node.next = subsequentNode
}
