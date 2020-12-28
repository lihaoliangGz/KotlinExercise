package com.cvbmgh.untitled.basic

import java.util.*

/**
 * 基本类型
 */
fun main() {

    t()
    compare()
    covert()
    division()
    bit()
    check('1')
    array()
    array2()
    string()
}

//===数字===
//字面常量
const val ONE_MILLION = 1_000_000
fun t() {
    println(ONE_MILLION)
}

//表示方式
fun compare() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 128
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
}

//显示转换
fun covert() {
    val b: Byte = 1
    //val i: Int = b  //error

    val i: Int = b.toInt()
    println(i)

    val l = 1L + 3
    println(l)
}

//===运算===
//整数除法
fun division() {
    val x = 5 / 2
    //println(x==2.5)  //error
    println(x == 2)

    val x1 = 5L / 2
    println(x1 == 2L)

    val x2 = 5 / 2.toDouble()
    println(x2)
}

//位运算
fun bit() {
    val x = (1 shl 2)
    println(x)

    println("异或=${1 xor 2}, 位与=${1 and 0}, 位或=${1 or 0}, 位非=?")
}

//字符
fun check(c: Char) {
    //if (c == 1) {  //// 错误：类型不兼容
    if (c == '1') {
    }

    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // 显式转换为数字
    }

    var result: Int = decimalDigitValue('2')
    println("result=$result, ${'2'.toInt()}")
}

//数组
fun array() {
    val a = arrayOf(1, 2, 3, 4, 5)
    val aNulls = arrayOfNulls<Int>(2)
    aNulls[0] = 22

    val asc = Array(5) { i -> (i * i).toString() }

    println("${Arrays.toString(a)}, a[1]=${a[1]}, asc=${Arrays.toString(asc)},  aNulls[0]=${aNulls[0]}")
}

//原生类型数组--无装箱开销的专门的类
fun array2() {
    var x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(Arrays.toString(x))

    val arr = IntArray(5)
    arr[0] = 244020190

    var arr2 = IntArray(5) { it * 2 }
    println(Arrays.toString(arr2))

    val byteArray = byteArrayOf(127, 126)
    println(Arrays.toString(byteArray))
}

//字符串--转义字符串、原始字符串
fun string() {
    var text = "Hello,World!\n"
    print(text)

    val text2 = """|Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    |${'$'}
    |\n \u2123
    |"""
    println(text2)
}
