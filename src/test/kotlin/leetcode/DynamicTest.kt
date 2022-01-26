package leetcode

import leetcode.dynamic.rob
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DynamicTest {

    @Test
    fun `test that we can get the most cash when we rob neighbours`() {
        assertEquals(12, rob(intArrayOf(2, 7, 9, 3, 1)))
        assertEquals(4, rob(intArrayOf(1, 2, 3, 1)))
        assertEquals(4, rob(intArrayOf(4)))
        assertEquals(9, rob(intArrayOf(4, 2, 1, 5)))
    }
}