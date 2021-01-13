/**
 *
 */
fun main() {
    operation()

    to()

    sort()
}

fun operation() {
    val numbers = mutableListOf("one", "two", "three", "four");
    numbers.filter { it.length > 3 }
    println("numbers=$numbers")
    val longerThan3 = numbers.filter { it.length > 3 }
    println("longerThan3=$longerThan3")

    numbers[0] = "one-1"
    numbers[3] = "three-3"
    println("numbers=$numbers , longerThan3=$longerThan3")
}

fun to() {
    val numbers = listOf("one", "two", "three", "four")
    val filterResults = mutableListOf<String>()

    val result = numbers.filterTo(filterResults) { it.length > 3 }
    println("filterResults=$filterResults, result=$result")

    val resultSet = numbers.mapTo(HashSet()) { it.length }
    println("resultSet=$resultSet")
}

fun sort() {
    val numbers = mutableListOf("one", "two", "three", "four")
    val sortedNumbers = numbers.sorted();
    println("numbers=$numbers, sortedNumbers=$sortedNumbers")
    numbers.sort();
    println("numbers=$numbers")
}