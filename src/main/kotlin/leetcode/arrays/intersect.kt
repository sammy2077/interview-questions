package leetcode.arrays

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/">Leetcode</a>
 */
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    if (nums2.size > nums1.size) {
        return intersect(nums2, nums1)
    }
    val map = hashMapOf<Int, Int>()
    for (number in nums1) {
        map[number] = map.getOrDefault(number, 0) + 1
    }
    val listOfIntersection = arrayListOf<Int>()
    for (number in nums2) {
        val count = map.getOrDefault(number, 0)
        if (count > 0) {
            listOfIntersection.add(number)
            map[number] = count - 1
        }
    }
    return listOfIntersection.toIntArray()
}
