package leetcode.design

import java.util.Stack

class MinStack() {
    private val mainStack = Stack<Int>()
    private val minimums = Stack<Int>()

    fun push(v: Int) {
        mainStack.push(v)
        val minimum = if (minimums.isEmpty() || v < minimums.peek()) v else minimums.peek()
        minimums.push(minimum)
    }

    fun pop() {
        mainStack.pop()
        minimums.pop()
    }

    fun top(): Int = mainStack.peek()

    fun getMin(): Int = minimums.peek()
}

fun main() {
    val minStack = MinStack()
    minStack.push(0)
    minStack.push(1)
    minStack.push(0)
    minStack.getMin().let(::println) // return -3

    minStack.pop()
    minStack.top().let(::println) // return 0

    minStack.getMin().also { println(it) } // return -2

}