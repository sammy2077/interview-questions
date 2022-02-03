import leetcode.arrays.containsDuplicate
import leetcode.arrays.intersect
import leetcode.arrays.maxProfit
import leetcode.arrays.moveZeroes
import leetcode.arrays.plusOne
import leetcode.arrays.removeDuplicates
import leetcode.arrays.singleNumber
import leetcode.dynamic.rob
import leetcode.linkedlists.ListNode
import leetcode.linkedlists.isPalindrome
import leetcode.linkedlists.removeNthFromEnd
import leetcode.math.romanToInt
import leetcode.others.isValid
import leetcode.strings.firstUniqChar
import leetcode.strings.myAtoi
import leetcode.strings.myAtoiSimple
import leetcode.strings.reverseString
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class LeetCodeTests {

    @Test
    fun `test for myAtoi`() {
        assertEquals(42, myAtoi("42"))
        assertEquals(-42, myAtoi("   -42"))
        assertEquals(4193, myAtoi("4193 with words"))
        assertEquals(Int.MAX_VALUE, myAtoi("41939764967456 with words"))
    }

    @Test
    fun `test for myAtoiSimple`() {
        assertEquals(42, myAtoiSimple("42"))
        assertEquals(-42, myAtoiSimple("   -42"))
        assertEquals(4193, myAtoiSimple("4193 with words"))
        assertEquals(Int.MAX_VALUE, myAtoiSimple("41939764967456 with words"))
    }

    @Test
    fun `test isValidParenthesis`() {
        assertFalse(isValid("(("))
        assertFalse(isValid("()("))
        assertFalse(isValid("}"))
        assertTrue(isValid("(())"))
        assertTrue(isValid("(({{}}))"))
        assertTrue(isValid("(({[{}]}))"))
    }

    @Test
    fun `test for firstUniqChar`() {
        assertEquals(0, firstUniqChar("kenya"))
        assertEquals(-1, firstUniqChar("kkk"))
        assertEquals(0, firstUniqChar("b"))
        assertEquals(1, firstUniqChar("worldwide"))
    }

    @Test
    fun `test for reverseString`() {
        assertEquals("a", reverseString("a"))
        assertEquals("ana", reverseString("ana"))
        assertEquals("hello", reverseString("olleh"))
        assertEquals("agweria", reverseString("airewga"))
    }

    @Test
    fun `test for romanToInt`() {
        assertEquals(3, romanToInt("III"))
        assertEquals(4, romanToInt("IV"))
        assertEquals(58, romanToInt("LVIII"))
        assertEquals(1994, romanToInt("MCMXCIV"))
        assertEquals(500, romanToInt("D"))
    }

    @Test
    fun `test for the remove n-th node from end`() {
        val node = ListNode(4)

        assertNull(removeNthFromEnd(node, 1))

        val node2 = ListNode(6, ListNode(5, node))
//        node2.next = node
        assertNotNull(removeNthFromEnd(node2, 1))
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

    @Test
    fun `test that we can get the most cash when we rob neighbours`() {
        assertEquals(12, rob(intArrayOf(2, 7, 9, 3, 1)))
        assertEquals(4, rob(intArrayOf(1, 2, 3, 1)))
        assertEquals(4, rob(intArrayOf(4)))
        assertEquals(9, rob(intArrayOf(4, 2, 1, 5)))
    }

    @Test
    fun `test removeDuplicates`() {
        assertEquals(4, removeDuplicates(intArrayOf(1, 2, 3, 4)))
        assertEquals(0, removeDuplicates(intArrayOf()))
        assertEquals(1, removeDuplicates(intArrayOf(1)))
        assertEquals(1, removeDuplicates(intArrayOf(1, 1, 1, 1, 1, 1, 1)))
    }

    @Test
    fun `test the maxProfit`() {
        assertEquals(7, maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(4, maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        assertEquals(0, maxProfit(intArrayOf()))
        assertEquals(0, maxProfit(intArrayOf(5, 4, 2)))
    }

    @Test
    fun `test for moveZeroes`() {
        assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), moveZeroes(intArrayOf(0, 1, 0, 3, 12)))
        assertArrayEquals(intArrayOf(0, 0), moveZeroes(intArrayOf(0, 0)))
        assertArrayEquals(intArrayOf(1, 0, 0, 0, 0), moveZeroes(intArrayOf(0, 0, 0, 0, 1)))
        assertArrayEquals(intArrayOf(1, 2, 3, 4), moveZeroes(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun `test for containsDuplicate`() {
        assertTrue(containsDuplicate(intArrayOf(1, 1)))
        assertTrue(containsDuplicate(intArrayOf(1, 1, 4, 4, 4, 5, 6, 6, 6)))
        assertFalse(containsDuplicate(intArrayOf()))
        assertFalse(containsDuplicate(intArrayOf(2, 3, 4, 5, 6)))
    }

    @Test
    fun `test for singleNumber`() {
        assertEquals(2, singleNumber(intArrayOf(1, 1, 2)))
        assertEquals(4, singleNumber(intArrayOf(4, 1, 1, 2, 2)))
    }

    @Test
    fun `test for plusOne`() {
        assertArrayEquals(plusOne(intArrayOf(9)), intArrayOf(1, 0))
        assertArrayEquals(plusOne(intArrayOf(1, 2, 3)), intArrayOf(1, 2, 4))
        assertArrayEquals(plusOne(intArrayOf(9, 9, 9, 9)), intArrayOf(1, 0, 0, 0, 0))
        assertArrayEquals(plusOne(intArrayOf(1)), intArrayOf(2))
        assertArrayEquals(plusOne(intArrayOf(0)), intArrayOf(1))
    }

    @Test
    fun `test for intersect`() {
        assertArrayEquals(intArrayOf(), intersect(intArrayOf(9), intArrayOf(1, 0)))
        assertArrayEquals(intArrayOf(1), intersect(intArrayOf(1), intArrayOf(1, 0)))
    }
}
