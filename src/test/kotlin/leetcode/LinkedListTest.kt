package leetcode

import leetcode.linkedlists.ListNode
import leetcode.linkedlists.removeNthFromEnd
import org.junit.jupiter.api.Test
import kotlin.test.assertNull

internal class LinkedListTest {

    @Test
    fun `test for the remove n-th node from end`() {
        val node = ListNode(4)

        assertNull(removeNthFromEnd(node, 1))

//        val node2 = ListNode(6, ListNode(5, node))
////        node2.next = node
//        assertNull(removeNthFromEnd(node2, 1))
    }
}