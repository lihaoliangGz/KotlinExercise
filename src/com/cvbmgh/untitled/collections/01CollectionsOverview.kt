package com.cvbmgh.untitled.collections

/**
 *
 */
fun main() {
    setT()
}

//List
fun listT() {
    val numbers = listOf(1, 2, 3);
}

//Set
fun setT() {
    val numbers = setOf(1, 2, 3, 4);
    print("${numbers.first()},${numbers.last()}")
}

//Map
fun mapT() {
    val numbersMap = mapOf("k1" to 1, "k2" to 2)
    val numbersMap2 = mutableMapOf("k1" to 1, "k2" to 2)
    numbersMap2.put("k3", 3)

}