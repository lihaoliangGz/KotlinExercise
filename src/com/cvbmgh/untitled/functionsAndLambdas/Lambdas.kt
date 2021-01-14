package com.cvbmgh.untitled.functionsAndLambdas

/**
 * lambda表达式
 */
fun main() {
    l()
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