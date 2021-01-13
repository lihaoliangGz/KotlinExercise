package com.cvbmgh.untitled.collections

/**
 * 加减操作符
 */
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val plusList = numbers + "five"
    val minusList = numbers - listOf("two")
    println(plusList)
    println(minusList)
}