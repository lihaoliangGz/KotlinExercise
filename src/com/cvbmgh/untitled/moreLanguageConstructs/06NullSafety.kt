package com.cvbmgh.untitled.moreLanguageConstructs

/**
 * 空安全
 */
fun main() {
    var a: String = "abc"
    //a = null //error
    println(a.length)

    var b: String? = "abc"
    b = null
    //println(b.length)

    if (b != null) {
        println(b.length)
    } else {
        println(-1)
    }

    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    }

    //安全调用 ?.
    println(b?.length)

    //安全调用也可以出现在赋值的左侧
    // 如果 `person` 或者 `person.department` 其中之一为空，都不会调用该函数：
    //person?.department?.head = managersPool.getManager()


    //Elvis操作符 ?:
    val l = b?.length ?: -1
    println("l=$l")
    fun foo(node: jdk.nashorn.internal.runtime.regexp.joni.ast.Node) {
        val parent = node.parent ?: null
        val name = node.name ?: throw IllegalArgumentException("name expected")
    }


    //!!操作符  非空断言运算符
    //val l = b!!.length

    //安全的类型转换
    val aInt: Int? = b as? Int
    println("aInt=$aInt")

    //可空集合过滤非空元素
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
}

