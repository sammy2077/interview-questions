package hackerrank

fun matchingStrings(strings: Array<String>, queries: Array<String>): IntArray {
    val map = HashMap<String, Int>()

    for (string in strings) {
        map[string] = map.getOrDefault(string, 0) + 1
    }
    val result = IntArray(queries.size) { 0 }
    for (i in queries.indices) {
        result[i] = map.getOrDefault(queries[i], 0)
    }
    return result
}

fun main() {
    println(matchingStrings(arrayOf("aba", "baba", "aba", "xzxb"), arrayOf("aba", "xzxb", "ab")).contentToString())
}
