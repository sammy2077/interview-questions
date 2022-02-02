package leetcode

import leetcode.arrays.containsDuplicate
import leetcode.arrays.intersect
import leetcode.arrays.maxProfit
import leetcode.arrays.moveZeroes
import leetcode.arrays.plusOne
import leetcode.arrays.removeDuplicates
import leetcode.arrays.singleNumber
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ArraysTest {

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
