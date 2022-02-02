package leetcode.others

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val pairs = mapOf('(' to ')', '{' to '}', '[' to ']')
    for (char in s) {
        if (char in pairs.keys) {
            stack.addLast(char)
        } else if (stack.isEmpty() || pairs[stack.removeLast()] != char) {
            return false
        }
    }
    return stack.isEmpty()
}

fun main() {
    println(isValid("(({}))"))
}
