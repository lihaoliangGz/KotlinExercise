package com.cvbmgh.untitled.classesAndObjects

/**
 * 嵌套类与内部类
 */
fun main() {
    val demo = Outer.Nested().foo()
    println(demo)

    val demo2 = Outer().Inner().foo()
    println(demo2)
}

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }
}

interface OuterInterface {
    class InnerClass
    interface InnerInterface
}

class OuterClass {
    class InnerClass
    interface InnerInterface
}

