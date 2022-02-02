package leetcode.strings

fun firstUniqChar(s: String): Int {
    val occurrence = IntArray(26)
    for (ch in s) {
        occurrence[ch - 'a']++
    }
    for (i in s.indices) {
        val char = s[i] - 'a'
        if (occurrence[char] == 1) {
            return i
        }
    }
    return -1
}

fun main() {
    println(firstUniqChar("daadab"))
}