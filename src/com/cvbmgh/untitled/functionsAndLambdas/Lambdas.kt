package com.cvbmgh.untitled.functionsAndLambdas

/**
 * lambda表达式
 */
fun main() {
    l()
    invoke()
}

fun l() {
    val items = listOf(1, 2, 3, 4, 5)
    items.fold(0, { acc: Int, i: Int ->
        println("acc=$acc,i=$i")
        val result = acc + i
        println("result=$result")
        //lambda 表达式中的最后一个表达式是返回值：
        result
    })

}

//函数类型
var onClick: (() -> Unit)? = null

val onClick1: () -> Unit = {
    println("onClick")
}

val onClick2: (Int) -> Unit = {
    println("onClick2, it=" + it)
}

val onClick3: (Int, String) -> Unit = { i, s ->
    println("onClick3, i=" + i + ", s=" + s)
}

typealias ClickHandler = (Int, String) -> Unit  //类型别名

//函数类型实例化
//匿名函数
val onClick4: (Int) -> Unit = fun(i: Int): Unit {
    println("函数类型实例化-匿名函数")
}


//函数类型实例调用
fun invoke() {
    onClick1.invoke()
    onClick2(9872)
}

//lambda表达式
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }  //完整语法
val sum2 = { x: Int, y: Int -> x + y }
