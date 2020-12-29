package com.cvbmgh.untitled.basics

/**
 * 返回和跳转
 */
fun main() {
    //Break 与 Continue 标签
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            println("i=$i,j=$j")
            if (j > 2) {
                break@loop
                //continue@loop
            }
        }
    }

    //返回到标签
    returnLabel()
}

fun returnLabel() {
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach() {
            if ((it == 3)) return  // 非局部直接返回到 foo() 的调用者
            print(it)
        }
        println("foo() this point is unreachable")
    }
    foo()
    println()

    fun foo2() {
        listOf(1, 2, 3, 4, 5).forEach list@{
            if (it == 3) return@list // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
            print(it)
        }
        println()
        println("foo2() this point is unreachable")
    }
    foo2()
    println()

    fun foo3() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
            print(it)
        }
        print(" foo()3 done with implicit label")
    }
    foo3()
    println()

    fun foo4() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return  // 局部返回到匿名函数的调用者，即 forEach 循环
            print(value)
        })
        print(" foo()4 done with anonymous function")
    }
    foo4()
    println()

    fun foo5() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop // 从传入 run 的 lambda 表达式非局部返回
                print(it)
            }
        }
        print(" foo()5 done with nested loop")
    }
    foo5()
}