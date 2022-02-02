package hackerrank

fun twoStrings(s1: String, s2: String): String {
    val setA = hashSetOf<Char>()
    val setB = hashSetOf<Char>()

    s1.toCharArray().forEach { char ->
        setA.add(char)
    }
    s2.toCharArray().forEach { char ->
        setB.add(char)
    }

    setA.retainAll(setB)

    return if (setA.isEmpty()) "NO" else "YES"
}
