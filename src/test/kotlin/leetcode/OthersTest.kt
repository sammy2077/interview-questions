package leetcode

import leetcode.others.isValid
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class OthersTest {

    @Test
    fun `test isValidParenthesis`() {
        assertFalse(isValid("(("))
        assertFalse(isValid("()("))
        assertFalse(isValid("}"))
        assertTrue(isValid("(())"))
        assertTrue(isValid("(({{}}))"))
        assertTrue(isValid("(({[{}]}))"))
    }
}
