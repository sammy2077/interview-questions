package p

/**
 * Run Length Encoding
 *
 * @param s String to encode
 * @return the result of the encoding
 *
 * @see <a href='https://www.youtube.com/watch?v=mjZpZ_wcYFg'>Original Video</a>
 */
fun runLength(s: String): String {
    if (s.isBlank()) {
        return ""
    }
    var counter = 1
    var result = StringBuilder()
    var prevChar = s[0]
    for (i in 1 until s.length) {
        if (s[i] != prevChar) {
            result.append(counter).append(prevChar)
            counter = 0
            prevChar = s[i]
        }
        counter++
    }
    result = result.append(counter).append(prevChar)
    return result.toString()
}

fun main() {
    println(runLength("aaaaaa"))
    println(runLength("aaaaaabbbbccccddd"))
    println(runLength("abcd"))
    println(runLength("abababab"))
    println(runLength("a"))
    println(runLength("  "))
    println(runLength(""))
}
