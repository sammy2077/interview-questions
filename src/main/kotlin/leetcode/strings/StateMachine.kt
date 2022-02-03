package leetcode.strings

enum class State {
    q0, q1, q2, qd
}

/**
 * Implementation of a Simple State Machine
 *
 * A simple class for DFA - available 4 states in [State]
 *
 * @property state The current [State] of the machine. Default is [State.q0]
 */
class StateMachine {
    private var state: State = State.q0

    private var result: Int = 0
    private var sign: Int = 1

    /**
     * Transition the machine to the first state [State.q1]
     */
    private fun toStateQ1(ch: Char) {
        sign = if (ch == '-') -1 else 1
        state = State.q1
    }

    /**
     * Transition the machine to second state [State.q2]
     */
    private fun toStateQ2(digit: Int) {
        state = State.q2
        appendDigit(digit)
    }

    /**
     * Transition to dead state [State.qd]
     */
    private fun toStateQd() {
        state = State.qd
    }

    /**
     * Append digit to result, if out of range return clamped value.
     * Modifies  [finalResult]
     *
     * @param digit The digit to append.
     */
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

    /**
     * Change state based on current input character.
     *
     * @param ch The input character for transition
     */
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

    /**
     * Get the current state
     * @return The current state [state]
     */
    fun getState() = state

    /**
     * Return the final result formed with it's sign.
     * @return the computed result of [sign] and [finalResult]
     */
    fun finalResult() = sign * result
}
