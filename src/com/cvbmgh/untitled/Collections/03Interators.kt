/**
 * 迭代器
 */
fun main() {
    t()
}

fun t() {
    val numbers = listOf("one", "two", "three", "four")
    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println()

    for (item in numbers) {
        println(item)
    }

    println()

    numbers.forEach() {
        println(it)
    }

}