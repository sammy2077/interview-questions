package leetcode.sorting

/**
 * Version Control Class
 *
 * Simple class to determine if a version is bad
 */
open class VersionControl {
    /**
     * Is Bad version
     *
     * @param v The version number to check
     * @param bad The first bad version
     *
     * @return true if the version is bad
     */
    fun isBadVersion(v: Int, bad: Int): Boolean {
        return v >= bad
    }
}

/**
 * Solution
 *
 *
 * @see <a href='https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/'>First Bad Version</a>
 */
class Solution : VersionControl() {
    /**
     * First bad version
     *
     * A function that checks the first bad version using the least number of calls to the [isBadVersion] API
     *
     * @param n The versions to check
     * @param bad The first bad version
     */
    fun firstBadVersion(n: Int, bad: Int): Int {
        var start = 1
        var end = n
        var foundBadVersion = -1
        while (start <= end) {

            val midpoint = start + (end - start) / 2
            val isBad = isBadVersion(midpoint, bad)
            if (isBad) {
                foundBadVersion = midpoint
                end = midpoint - 1
            } else {
                start = midpoint + 1
            }
        }
        return foundBadVersion
    }
}
