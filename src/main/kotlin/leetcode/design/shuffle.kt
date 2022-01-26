package leetcode.design

import kotlin.random.Random

class Solution(var nums: IntArray) {

    fun reset(): IntArray = nums

    fun shuffle(): IntArray {
        val result = nums.copyOf()

        for (i in result.indices) {
            val index = Random.nextInt(i + 1)
            result[i] = result[index].also { result[index] = result[i] }
        }
        return result
    }

}

fun main() {
    val obj = Solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))

    with(obj) {
        println(shuffle().contentToString())
        println(reset().contentToString())

        println(shuffle().contentToString())
        println(reset().contentToString())

        println(shuffle().contentToString())
        println(reset().contentToString())

        println(shuffle().contentToString())


    }
}