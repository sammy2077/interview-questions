package leetcode.linkedlists

fun isPalindrome(head: ListNode?): Boolean {
    if (head?.next == null) {
        return true
    }

    val values = mutableListOf<Int>()

    var currentNode = head

    while (currentNode != null) {
        values.add(currentNode.`val`)
        currentNode = currentNode.next
    }

    var start = 0
    var end = values.size - 1

    while (end > start) {
        if (values[start] != values[end]) {
            return false
        }
        start++
        end--
    }

    return true

}

fun main() {
    println(isPalindrome(ListNode(7, ListNode(7))))
    println(isPalindrome(ListNode(7, ListNode(7, ListNode(7)))))
    println(isPalindrome(ListNode(7)))
}