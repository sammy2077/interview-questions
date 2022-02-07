package leetcode.strings

/**
 * String to integer (atoi)
 *
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 *  - Read in and ignore any leading whitespace.
 *  - Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 *  - Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 *  - Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 *  - If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 *  - Return the integer as the final result.
 *
 *  *Note*: Only the space character ' ' is considered a whitespace character.
 *  **Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.**
 *
 *  This implementation uses the concept of [StateMachine]
 *
 *  @param s the input string
 *  @return the atoi result
 */
fun myAtoi(s: String): Int {
    val stateMachine = StateMachine()
    var i = 0
    while (i < s.length && stateMachine.getState() !== State.qd) {
        stateMachine.transition(s[i])
        ++i
    }
    return stateMachine.finalResult()
}

/**
 * Simple String to integer (atoi)
 *
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 *  - Read in and ignore any leading whitespace.
 *  - Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 *  - Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 *  - Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 *  - If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 *  - Return the integer as the final result.
 *
 *  *Note*: Only the space character ' ' is considered a whitespace character.
 *  **Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.**
 *
 *  @param input the input string
 *  @return the atoi result
 */
fun myAtoiSimple(input: String): Int {
    var sign = 1
    var result = 0
    var index = 0
    val n: Int = input.length

    // Discard all spaces from the beginning of the input string.

    // Discard all spaces from the beginning of the input string.
    while (index < n && input[index] == ' ') {
        index++
    }

    // sign = +1, if it's positive number, otherwise sign = -1.

    // sign = +1, if it's positive number, otherwise sign = -1.
    if (index < n && input[index] == '+') {
        sign = 1
        index++
    } else if (index < n && input[index] == '-') {
        sign = -1
        index++
    }

    // Traverse next digits of input and stop if it is not a digit

    // Traverse next digits of input and stop if it is not a digit
    while (index < n && Character.isDigit(input[index])) {
        val digit: Int = input[index] - '0'

        // Check overflow and underflow conditions.
        if (result > Int.MAX_VALUE / 10 ||
            result == Int.MAX_VALUE / 10 && digit > Int.MAX_VALUE % 10
        ) {
            // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
            return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
        }

        // Append current digit to the result.
        result = 10 * result + digit
        index++
    }

    // We have formed a valid number without any overflow/underflow.
    // Return it after multiplying it with its sign.

    // We have formed a valid number without any overflow/underflow.
    // Return it after multiplying it with its sign.
    return sign * result
}
