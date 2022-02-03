package leetcode.arrays

/**
 * Plus One
 *
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to the least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * @param digits the input array
 *
 * @return the array with result of addition
 *
 * @see <a hre="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/">Plus One</a>
 */
fun plusOne(digits: IntArray): IntArray {
    var carry = 0
    for (i in digits.size - 1 downTo 0) {
        val value = digits[i] + 1
        if (value > 9) {
            digits[i] = 0
            carry = 1
        } else {
            digits[i] = value
            return digits
        }
    }
    return if (carry == 1) {
        intArrayOf(1).plus(digits)
    } else {
        digits
    }
}
