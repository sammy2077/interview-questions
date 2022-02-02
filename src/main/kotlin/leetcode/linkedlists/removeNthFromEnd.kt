package leetcode.linkedlists

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    if (head?.next == null) {
        return null
    }
    var parentToRemoveNode = head

    var index = 0

    var currentNode = head

    while (currentNode != null) {
        index++
        if (index - n - 1 > 0) {
            parentToRemoveNode = parentToRemoveNode?.next
        }
        currentNode = currentNode.next
    }
    return if (index - n == 0) {
        parentToRemoveNode?.next
    } else {
        parentToRemoveNode!!.next = parentToRemoveNode?.next?.next
        head
    }
}
