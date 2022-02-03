import cake.binarySearch
import cake.getMaxProfit
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

internal class InterviewCakeTest {
    @Test
    fun `test binarySearch`() {
        assertEquals(9, binarySearch(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11), 11))
        assertEquals(-1, binarySearch(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11), 30))
    }

    @Test
    fun `test for maxProfit`() {
        assertEquals(16, getMaxProfit(intArrayOf(10, 7, 5, 8, 11, 9, 4, 20)))
        assertEquals(-1, getMaxProfit(intArrayOf(10, 9)))
        assertThrows<Exception> { getMaxProfit(intArrayOf(10)) }
    }
}
