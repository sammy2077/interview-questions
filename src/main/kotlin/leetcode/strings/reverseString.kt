package leetcode.strings

fun reverseString(input: String): String {
    val s = input.toCharArray()
    var left = 0
    var right = s.size - 1
    while (left < right) {
        val temp = s[left]
        s[left++] = s[right]
        s[right--] = temp
    }
    return s.concatToString()
}

fun main() {
    println(reverseString("ab"))
}