package com.cvbmgh.untitled.functionsAndLambdas

/**
 *
 */
fun main() {
    foo(baz = 3)
    foo(111, 222)
    foo(bar = 33, 3)

    val b = B()
    b.foo()
    b.foo(qux = { println("hello") })
    b.foo { println("world") }

    println(double(11))
    println(double2(45))

    var arr = arrayOf(1, 1)
    println(asList(1, 2, 3, 5, 6, "1sasjgl", *arr))
    val asList = asList(1, "a")
    println("size=${asList.size}")

    dfs()

    var p1 = findFixPoint(5.0)
    var p2 = findFixPoint()
    println("p1=$p1,p2=$p2")

}

fun foo(bar: Int = 0, baz: Int) {
    println("bar=$bar,baz=$baz")
}

open class A {
    open fun foo(i: Int = 55) {
        println(i)
    }
}

class B : A() {
    override fun foo(i: Int) {
        super.foo(i)
    }

    fun foo(int: Int = 0, qux: () -> Unit) {
        println("重载foo()")
        qux()
    }
}

//===返回 Unit 的函数===
fun printHello(name: String?): Unit {
    return Unit
}

fun printHello2(name: String?) {
    //do nothing
}

//===单表达式函数===
fun double(x: Int): Int = x * 2
fun double2(x: Int) = x * 2

//===可变数量的参数（Varargs）===
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

//===中缀表示法===
class MyStringCollection {
    infix fun add(s: String) {

    }

    fun build() {
        this add "1"
        add("1")
        //add "abc"        // 错误：必须指定接收者
    }
}

//===函数作用域===
//局部函数
fun dfs() {
    println("函数dfs()")
    val vis = 2

    fun dfs() {
        println("局部函数dfs(),vis=$vis")
    }
    dfs()
}

//尾递归函数
val eps = 1E-10

fun findFixPoint(x: Double = 1.0): Double = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))

private fun findFixPoint(): Double {
    var x = 5.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}