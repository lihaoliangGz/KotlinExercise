package com.cvbmgh.untitled.classesAndObjects

/**
 * 泛型
 */
fun main() {
    var box = Box(1)
    println("box=${box.value}")
}

class Box<T> public constructor(t: T) {
    var value = t
    var l = listOf<Int>(1)

}