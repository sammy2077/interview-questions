package leetcode.arrays

/**
 * @see <a hre="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/">Leetcode</a>
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