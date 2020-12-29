package com.cvbmgh.untitled.classesAndObjects

import java.util.function.IntPredicate

/**
 * 函数式（SAM）接口
 */
fun main() {
    //println("${isEven.accept()}")
}

fun interface InpPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }
