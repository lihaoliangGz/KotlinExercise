package com.cvbmgh.untitled.classesAndObjects

/**
 * 类型别名
 */
fun main() {
    println(foo { it > 0 })

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p)) // 输出 "[1]"
}

typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(21)
