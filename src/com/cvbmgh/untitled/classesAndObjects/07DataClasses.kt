package com.cvbmgh.untitled.classesAndObjects

/**
 * 数据类
 */
fun main() {
    var u = User("葱头", 12)
    println("${u.toString()}")

    var p = Person2("人")
    println("${p.toString()}")

    //复制
    //val jack = User("Jack", 1)
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 6)
    println("${olderJack.toString()}")

    //数据类与解构声明
    var j = User(name = "J", age = 2)
    var (name, age) = j
    println("$name, $age")
}

data class User(val name: String, val age: Int)

//在类体中声明的属性
data class Person2(var name: String) {
    val age: Int = 0
}

