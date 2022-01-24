package leetcode.sorting

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    if (nums2.isNotEmpty()) {

        var sortedIndex1 = 0  // pointer to the sorted array 1
        var sortedIndex2 = 0 // pointer to the sorted array 2

        // if item at sortedIndex 1 is greater than sorted index 2 --- swap, then increment sortedIndex 1
        // if item at sortedIndex 1 is less than or equal sortedIndex2 -- no swap, increment sorted Index 1

        while (sortedIndex1 + sortedIndex2 < m + n) {
            if (sortedIndex1 >= m) {
                nums1[sortedIndex1 + sortedIndex2] = nums2[sortedIndex2++]
            } else if (nums1[sortedIndex1] > nums2[sortedIndex2]) {
                val temp = nums1[sortedIndex1]
                nums1[sortedIndex1] = nums2[sortedIndex2]
                nums2[sortedIndex2] = temp
                sortedIndex1++
            } else {
                sortedIndex1++
            }
        }
    }
}