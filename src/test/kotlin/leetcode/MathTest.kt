package leetcode

import leetcode.math.romanToInt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MathTest {
    @Test
    fun `test for romanToInt`() {
        Assertions.assertEquals(3, romanToInt("III"))
        Assertions.assertEquals(4, romanToInt("IV"))
        Assertions.assertEquals(58, romanToInt("LVIII"))
        Assertions.assertEquals(1994, romanToInt("MCMXCIV"))
        Assertions.assertEquals(500, romanToInt("D"))
    }
}
