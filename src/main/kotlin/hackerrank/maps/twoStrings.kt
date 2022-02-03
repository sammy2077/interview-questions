package hackerrank.maps

/**
 * Two String Substring
 *
 * @see <a href="https://www.hackerrank.com/challenges/two-strings/problem">Hackerrank</a>
 *
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 */
fun twoStrings(s1: String, s2: String): Boolean {
    val setA = hashSetOf<Char>()
    val setB = hashSetOf<Char>()

    s1.toCharArray().forEach { char ->
        setA.add(char)
    }
    s2.toCharArray().forEach { char ->
        setB.add(char)
    }

    setA.retainAll(setB)

    return setA.isNotEmpty()
}
