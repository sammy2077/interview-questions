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
    val special = setOf('I', 'X', 'C')

    var sum = 0
    var skip = false

    for (i in s.indices) {
        if (skip) {
            skip = false
            continue
        } else if (s[i] in special && i < s.length - 1) {
            if (s[i + 1] in special) {
                sum += map[s[i]]!!
            } else {
                sum += (map[s[i + 1]]!! - map[s[i]]!!)
                skip = true
            }
        } else {
            sum += map[s[i]]!!
        }
    }

    return sum
}

fun main() {
    print(romanToInt("MCMXCIV"))
}