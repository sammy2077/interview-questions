package leetcode.math

fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000,
    )
    val special = mapOf('I' to setOf('V', 'X'), 'X' to setOf('L', 'C'), 'C' to setOf('D', 'M'))

    var sum = 0

    var i = 0

    while (i < s.length) {
        if (s[i] in special.keys && i < s.length - 1 && s[i + 1] in special[s[i]]!!) {
            val value = map[s[i + 1]]!! - map[s[i]]!!
            sum += value
            i++
        } else {
            sum += map[s[i]]!!
        }
        i++
    }

    return sum
}

fun main() {
    print(romanToInt("MCMXCIV"))
}