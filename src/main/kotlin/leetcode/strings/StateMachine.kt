package leetcode.strings

enum class State {
    q0, q1, q2, qd
}

class StateMachine {
    // Get current state.
    // Store current state value.
    private var state: State
        private set

    // Store result formed and it's sign.
    private var result: Int
    private var sign: Int

    init {
        state = State.q0
        result = 0
        sign = 1
    }

    // Transition to state q1.
    private fun toStateQ1(ch: Char) {
        sign = if (ch == '-') -1 else 1
        state = State.q1
    }

    // Transition to state q2.
    private fun toStateQ2(digit: Int) {
        state = State.q2
        appendDigit(digit)
    }

    // Transition to dead state qd.
    private fun toStateQd() {
        state = State.qd
    }

    // Append digit to result, if out of range return clamped value.
    private fun appendDigit(digit: Int) {
        if (result > Int.MAX_VALUE / 10 ||
            result == Int.MAX_VALUE / 10 && digit > Int.MAX_VALUE % 10
        ) {
            if (sign == 1) {
                // If sign is 1, clamp result to Integer.MAX_VALUE.
                result = Int.MAX_VALUE
            } else {
                // If sign is -1, clamp result to Integer.MIN_VALUE.
                result = Int.MIN_VALUE
                sign = 1
            }

            // When the 32-bit int range is exceeded, a dead state is reached.
            toStateQd()
        } else {
            // Append current digit to the result.
            result = result * 10 + digit
        }
    }

    // Change state based on current input character.
    fun transition(ch: Char) {
        if (state == State.q0) {
            // Beginning state of the string (or some whitespaces are skipped).
            if (ch == ' ') {
                // Current character is a whitespaces.
                // We stay in same state.
                return
            } else if (ch == '-' || ch == '+') {
                // Current character is a sign.
                toStateQ1(ch)
            } else if (Character.isDigit(ch)) {
                // Current character is a digit.
                toStateQ2(ch - '0')
            } else {
                // Current character is not a space/sign/digit.
                // Reached a dead state.
                toStateQd()
            }
        } else if (state == State.q1 || state == State.q2) {
            // Previous character was a sign or digit.
            if (Character.isDigit(ch)) {
                // Current character is a digit.
                toStateQ2(ch - '0')
            } else {
                // Current character is not a digit.
                // Reached a dead state.
                toStateQd()
            }
        }
    }

    // Return the final result formed with it's sign.
    val integer: Int
        get() = sign * result
}
