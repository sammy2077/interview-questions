package leetcode

import leetcode.linkedlists.ListNode
import leetcode.linkedlists.isPalindrome
import leetcode.linkedlists.removeNthFromEnd
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

internal class LinkedListTest {

    @Test
    fun `test for the remove n-th node from end`() {
        val node = ListNode(4)

        assertNull(removeNthFromEnd(node, 1))

//        val node2 = ListNode(6, ListNode(5, node))
// //        node2.next = node
//        assertNull(removeNthFromEnd(node2, 1))
    }

    @Test
    fun `test for palindromes`() {
        val node = ListNode(5)
        assertTrue(isPalindrome(node))
        assertTrue(isPalindrome(null))

        assertFalse(isPalindrome(ListNode(7, ListNode(5))))
        assertTrue(isPalindrome(ListNode(7, ListNode(5, ListNode(5, ListNode(7))))))
        assertTrue(isPalindrome(ListNode(1, ListNode(2, ListNode(1)))))
    }
}
