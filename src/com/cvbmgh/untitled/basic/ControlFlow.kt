package com.cvbmgh.untitled.basic

/**
 * 控制流：if、when、for、while
 */
fun main() {
    ifT()
    whenT()
    forT()
    whileT()
}

//===if===
//if可以作为表达式和语句
fun ifT() {
    val a = 12
    val b = 58

    var max: Int
    if (a > b) {
        println("choose a")
        max = a
    } else {
        println("choose b")
        max = b
    }

    var max2 = if (a > b) a else b
    println(max2)
}

//===when===
//when取代switch,可以当做表达式和语句
fun whenT() {
    var x = 15;
    when (x) {
        1 -> print("x==1")
        2 -> print("x==2")
        3, 4 -> print("x==3 or x==4")  //很多分支需要用相同的方式处理
        in 1..10 -> print("x在1..10区间")  //检测一个值in or !in 一个区间或集合中
        is Int -> print("是整型") //is检测
        !in 30..40 -> print("x不在30..40区间")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    println()

    var y = 23
    when {
        y == 223 -> println("执行")
        y == 42 -> println("y==42")
        else -> println("y是其他的值")
    }
}

//===for===
fun forT() {
    val ints = listOf(1, 2, 3)
    for (i in ints) {
        print("i=${i} \t")
    }

    println()

    for (i in 10 downTo 0 step 2) {
        print("$i\t")
    }

    println()

    val array = arrayOf(3, 1)
    for (i in array.indices) {
        print("$i=${array[i]}\t")
    }

    println()

    for ((index, value) in array.withIndex()) {
        print("index=$index,value=$value  ")
    }

    println()
}

//===while===
fun whileT() {
    var x = 1

    while (x < 5) {
        print("x=$x ")
        x++
    }

    println()

    var y = 1
    do {
        print("y=$y ")
        y++
    } while (y < 10)
}