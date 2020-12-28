package com.cvbmgh.untitled.start

/**
 * 编码规范
 */
fun main() {

}

//===语言特性的惯用法===
//不可变性
var allowedValues = arrayListOf("1")
val allowedValues2 = listOf("1")
fun t() {
    allowedValues[0] = "2"
    //allowedValues2[0] = "2"  //error
}

//默认参数值
//不良
fun foo() = foo("a")
fun foo(a: String) {
}

fun fooB(a: String = "b") {

}


//===Lambda 表达式参数===
