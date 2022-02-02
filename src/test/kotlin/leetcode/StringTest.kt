package leetcode

import leetcode.strings.firstUniqChar
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class StringTest {

    @Test
    fun `test for firstUniqChar`() {
        assertEquals(0, firstUniqChar("kenya"))
        assertEquals(-1, firstUniqChar("kkk"))
        assertEquals(0, firstUniqChar("b"))
        assertEquals(1, firstUniqChar("worldwide"))
    }
}