/**
 * 序列
 */
fun main() {
    sequence()
}

fun sequence() {
    val numbers = sequenceOf("one", "two", "tree")
    val list = listOf("1", "2", "3")
    println(numbers.toString())
    println(list)
    println("${list.asSequence()}")
}