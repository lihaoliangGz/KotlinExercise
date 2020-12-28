package com.cvbmgh.untitled.start

/**
 *
 */
fun main() {
    println("Hello World!")
    var total = sum(3, 4)
    println("$total,${sum2(1, 2)}")
    sum3(1, 2)
    incrementX()
    println("最大值${maxOf2(1, 2)}")
    println("字符串长度 = ${getStringLength(2)}, ${getStringLength2("2")}")
    forT()
    whileT()
    println("${describe(2L)}")
    rangeT()
}

//======函数======
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int) {
    println("sum3")
}

//======变量======
//val 定义只读变量,只能赋值一次
val a: Int = 1
val b = 2
//val c: Int
//c=2

//var 定义可重新赋值变量
//var x = 5
//x+=1
fun x() {
    var x = 5
    x += 1
}

//顶层变量
val PI = 3.14
var x = 0
fun incrementX() {
    x += 1
    println("顶层变量:x=$x")
}

//===字符串模板===
var j = 1
var j1 = "j is $j"
var j2 = "${j.toByte()}"

//===条件表达式===
//if 也可以用作表达式
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b

//===类型检测与自动类型转换===
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}

//===for循环===
fun forT() {
    val items = listOf("1", "2", "3")
    for (item in items) {
        print(item)
    }
    println()
}

//===while循环===
fun whileT() {
    val items = listOf("1", "2", "3")
    var index = 0
    while (index < items.size) {
        print(items[index])
        index++
    }
    println()
}

//===when 表达式===
fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "UnKnown"
    }

//===使用区间range===
fun rangeT() {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }
    if (0 !in 1..y + 1) {
        println("0 is out of range")
    }

    //区间迭代
    for (x in 1..5) {
        print(x)
    }
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {  //从9到0
        print(x)
    }
}



