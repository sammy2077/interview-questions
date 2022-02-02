package leetcode.arrays

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/">Leetcode</a>
 */
fun singleNumber(nums: IntArray): Int {
    val table = HashMap<Int, Int>()
    for (number in nums) {
        table[number] = table.getOrDefault(number, 0).plus(1)
//        if (table.containsKey(number)) {
//            table[number] = table[number]!!.plus(1)
//        } else {
//            table[number] = 1
//        }
    }
    return table.filter { it.value == 1 }.keys.first()
}
