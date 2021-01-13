/**
 * 过滤
 */
fun main() {
    filter()
    filterIsInstance()
    partition()
}

fun filter() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.filter { it.length > 3 })

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
    println(filteredMap)

    println(numbers.filterIndexed { index, s -> (index != 0 && s.length < 5) })
    println(numbers.filterNot { it.length <= 3 })
}

fun filterIsInstance() {
    val numbers = listOf(null, 1, "two", 3.0, "four")
    println("All String elements in upper case:")
    numbers.filterIsInstance<String>().forEach {
        println(it.toUpperCase())
    }

    println()

    numbers.filterNotNull().forEach {
        println(it.toString())
    }

    println()
}

fun partition() {
    val numbers = listOf("one", "two", "three", "four")
    val (match, rest) = numbers.partition { it.length > 3 }

    println(match)
    println(rest)
}
