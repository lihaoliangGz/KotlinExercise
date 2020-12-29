package com.cvbmgh.untitled.classesAndObjects

/**
 * 接口
 */
fun main() {

}

interface MyInterface {
    val prop: Int //抽象的

    val property: String get() = "foo"

    fun bar()
    fun foo() {
        //可选的方法体
    }
}

class Child : MyInterface {
    override val prop: Int = 123

    override fun bar() {
        TODO("Not yet implemented")
    }

}

interface A {
    fun foo() {
        println("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("bar")
    }
}

class C : A {
    override fun bar() {
        TODO("Not yet implemented")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        TODO("Not yet implemented")
    }

}