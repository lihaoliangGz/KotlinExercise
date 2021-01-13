package com.cvbmgh.untitled.collections

/**
 * 分组
 */
fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")

    println(numbers.groupBy { it.first().toUpperCase() })
    println(numbers.groupingBy { it.first() }.eachCount())
}