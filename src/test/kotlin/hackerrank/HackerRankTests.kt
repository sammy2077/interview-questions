package hackerrank

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class HackerRankTests {

    @Test
    fun `test for plusMinus`() {
        assertArrayEquals(
            arrayOf("0.500000", "0.333333", "0.166667"),
            plusMinus(intArrayOf(-4, 3, -9, 0, 4, 1))
        )
    }
}
