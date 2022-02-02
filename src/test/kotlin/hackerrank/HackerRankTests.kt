package hackerrank

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class HackerRankTests {
    private val outContent = ByteArrayOutputStream()
    private val originalOut = System.out

    @BeforeEach
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    @AfterEach
    fun restoreStreams() {
        System.setOut(originalOut)
    }

    @Test
    fun `test for plusMinus`() {
        plusMinus(intArrayOf(1, 2, 3, -1, -2, -3, 0, 0))
        assertEquals("hello", outContent.toString())
    }
}
