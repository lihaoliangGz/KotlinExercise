package com.cvbmgh.untitled.classesAndObjects

import org.omg.CORBA.Object

/**
 * 对象表达式与对象声明
 */
fun main() {
    val ab: A12 = object : A12(1), B12 {
        override val y = 15
    }

    foo()

    //DataProviderManager.registerDataProvider()
}

open class A12(x: Int) {
    public open val y: Int = x
}

interface B12 {}

fun foo() {
    val abHoc = object {
        val x: Int = 0
        val y: Int = 0
    }
    print(abHoc.x + abHoc.y)
}

class C12 {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 没问题
        //val x2 = publicFoo().x  // 错误：未能解析的引用“x”
        publicFoo().toString()
    }
}


//===对象声明===
object DataProviderManager {
    fun registerDataProvider(provider: Object) {
        // ……
    }

//    val allDataProviders: Collection<Object>
//        get() = // ……
}

//===伴生对象===