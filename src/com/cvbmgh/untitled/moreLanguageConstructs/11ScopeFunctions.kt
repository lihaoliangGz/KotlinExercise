package com.cvbmgh.untitled.moreLanguageConstructs

import kotlin.random.Random

/**
 *
 */
fun main() {
    val str = "Hello"

    //this
    str.run {
        println("length=$length")
        println("length=${this.length}") //和上句效果相同
    }

    //it
    str.let {
        println("length=${it.length}")
    }

    //takeIf 与 takeUnless
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("evenOrNull=$evenOrNull,oddOrNull=$oddOrNull")

    val s = "Hello"
    val caps = str.takeIf { it.isNotEmpty() }?.toUpperCase()
    //val caps = str.takeIf { it.isNotEmpty() }.toUpperCase() // 编译错误
    println(caps)
}