package com.cvbmgh.untitled.classesAndObjects

/**
 * 扩展
 */
fun main() {
    val list = listOf<Int>(1, 2, 3)
    println("调用新方法 ,${list.new(1)}")


    printClassName(Rectangle1())

    println("扩展属性,${list.lastIndex}")
}

//===扩展函数===
fun List<Int>.new(index: Int): Int {
    val tmp = this[index]
    return tmp
}


//===扩展静态解析
open class Shape1

class Rectangle1 : Shape()

fun Shape.getName() = "Shape"

fun Rectangle1.getName() = "Rectangle"

fun printClassName(s: Shape) {
    println(s.getName())
}

//===扩展属性===
val <T> List<T>.lastIndex: Int
    get() = size - 1