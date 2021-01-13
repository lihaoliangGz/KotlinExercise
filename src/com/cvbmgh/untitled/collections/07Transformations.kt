/**
 * 转换
 */
fun main() {
    map()
    mapNotNull()
    mapKeyValue()
    zip()
    unzip()
    associate()
    flatten()
    str()
}

fun map() {
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { index: Int, i: Int -> i * index })
}

fun mapNotNull() {
    val numbers = setOf(1, 2, 3)
    println(numbers.mapNotNull { if (it == 2) null else it * 3 })
    println(numbers.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })
}

fun mapKeyValue() {
    val numbers = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbers.mapKeys { it.key.toUpperCase() })
    println(numbers.mapValues { it.value + it.key.length })
}

fun zip() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))

    println(colors.zip(animals) { a, b -> "a=${a},b=${b.capitalize()}" })
}

fun unzip() {
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}

fun associate() {
    val numbers = listOf("one", "two", "three", "four", "abcd")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().toUpperCase() })

}

fun flatten() {
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())
}

fun str() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers)
    println(numbers.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println(listString)

    val nums = (1..100).toList()
    println(nums.joinToString(limit = 10))
    println(nums.joinToString(limit = 5) { "Element:${it}" })
}

