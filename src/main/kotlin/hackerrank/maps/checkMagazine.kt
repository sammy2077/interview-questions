package hackerrank.maps

/**
 * Check magazine
 *
 * @see <a href="https://www.hackerrank.com/challenges/ctci-ransom-note/problem">Check Magazine</a>
 *
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting.
 * He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note.
 * The words in his note are case-sensitive, and he must use only whole words available in the magazine.
 * He cannot use substrings or concatenation to create the words he needs.
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 */
fun checkMagazine(magazine: Array<String>, note: Array<String>): String {
    val table = hashMapOf<String, Int>()
    for (word in magazine) {
        table[word] = table.getOrDefault(word, 0) + 1
    }
    for (word in note) {
        val count = table[word] ?: 0
        if (count < 1) {
            return "No"
        }
        table[word] = count - 1
    }
    return "Yes"
}
