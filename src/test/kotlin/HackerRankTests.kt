import hackerrank.maps.checkMagazine
import hackerrank.maps.twoStrings
import hackerrank.plusMinus
import hackerrank.sorting.countSwaps
import hackerrank.sorting.maximumToys
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class HackerRankTests {

    @Test
    fun `test for maximumToys`() {
        assertEquals(4, maximumToys(intArrayOf(1, 12, 5, 111, 200, 1000, 10), 50))
        assertEquals(2, maximumToys(intArrayOf(1, 12, 5, 111, 200, 1000, 10), 15))
    }

    @Test
    fun `test for countSwaps`() {
        assertEquals(0, countSwaps(intArrayOf(1, 2, 3)))
        assertEquals(3, countSwaps(intArrayOf(3, 2, 1)))
    }

    @Test
    fun `test for checkMagazine`() {
        assertTrue(
            checkMagazine(
                "give me one grand today night".split(" ").toTypedArray(),
                "give one grand today".split(" ").toTypedArray()
            )
        )
        assertFalse(
            checkMagazine(
                "two times three is not four".split(" ").toTypedArray(),
                "two times two is four".split(" ").toTypedArray()
            )
        )
        assertFalse(
            checkMagazine(
                "ive got a lovely bunch of coconuts".split(" ").toTypedArray(),
                "ive got some coconuts".split(" ").toTypedArray()
            )
        )
    }

    @Test
    fun `test for plusMinus`() {
        assertArrayEquals(
            arrayOf("0.500000", "0.333333", "0.166667"),
            plusMinus(intArrayOf(-4, 3, -9, 0, 4, 1))
        )
    }

    @Test
    fun `test for twoStrings`() {
        assertTrue(twoStrings("and", "art"))
        assertFalse(twoStrings("be", "cat"))
    }
}
