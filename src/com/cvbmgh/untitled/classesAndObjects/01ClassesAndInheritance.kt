package com.cvbmgh.untitled.classesAndObjects

/**
 * 类与继承
 */
fun main() {
    var p = Person("abc")

    var p1 = Person(1)

    var p2 = Person()

    var subP = SubPerson("s")

    //var base = Base("名字")

    var derived = Derived("姓", "名")

}

open class Person constructor(firstName: String = "1") {

    val key = firstName.toUpperCase()

    init {
        println("初始化块,firstName= $firstName")
    }

    init {
        println("初始化块2, key= $key")
    }

    constructor(i: Int) : this(firstName = "1") {
        println("次构造函数 ,i=$i")
    }

}

class SubPerson(s: String) : Person(s) {

}

//===继承===
open class Shape {
    open val vertexCount: Int = 0

    init {
        println("Initializing Shape")
    }

    open fun draw() {
        println("Shape.draw()")
    }

    fun fill() {

    }
}

class Circle() : Shape() {
    override val vertexCount: Int = 4

    override fun draw() {
        super.draw()
    }

    inner class Filler {
        fun fill() {
            println("filling")
        }

        fun drawAndFill() {
            super@Circle.draw() /// 调用 Shape 的 draw() 实现
            fill()
        }
    }
}

open class Rectangle(override val vertexCount: Int = 4) : Shape() {
    val borderColor: String get() = "black"

    //使用final再次禁止覆盖
    final override fun draw() {
        super.draw()
    }
}

class Rect : Rectangle() {
    val fillColor: String get() = super.borderColor
}

//===派生类初始化顺序===
open class Base(val name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }
}

class Derived(name: String, val lastName: String) : Base(name.capitalize().also { println("Argument for Base: $it") }) {
    init {
        println("Initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

