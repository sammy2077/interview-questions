package p

class CustomList<Type>(private val arrayList: Array<Type>) : Iterable<Type> {
    private val size: Int = arrayList.size

    override fun iterator(): Iterator<Type> {
        // OverRiding Default List Iterator //
        return object : MutableIterator<Type> {
            private var currentIndex = 0
            override fun hasNext(): Boolean {
                // OverRiding Default hasNext  Method//
                return currentIndex < size && arrayList[currentIndex] != null
            }

            override fun next(): Type {
                // OverRiding Default next  Method//
                return arrayList[currentIndex++]
            }

            override fun remove() {
                // OverRiding Default Remove  Method.
                throw UnsupportedOperationException()
            }
        }
    }
}

fun main() {
    val data = arrayOf("Tim Cook", "Mark Zuckerberg", "Elon Musk", "Jeff Bezos")
    val Listt = CustomList(data)
    // creating a CustomList Object Which OverRides.
    // The Iterator and Use The Custom Iterator Which is Defined in The Code.
    // creating a CustomList Object Which OverRides.
    // The Iterator and Use The Custom Iterator Which is Defined in The Code.
    val temp: Iterator<*> = Listt.iterator() // getting Custom iterator from List.

    while (temp.hasNext()) { // custom hasNext() Method
        val value = temp.next().toString() // Custom Method Return The Current Index
        print("$value, ")
    }
}
