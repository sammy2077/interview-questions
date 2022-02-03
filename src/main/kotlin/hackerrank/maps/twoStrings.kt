package hackerrank.maps

/**
 * Two String Substring
 *
 *
 *
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 *
 * @param s1 the first string
 * @param s2 the second string
 * @return true when a substring can be found, otherwise false
 *
 * @see <a href="https://www.hackerrank.com/challenges/two-strings/problem">Hackerrank</a>
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
