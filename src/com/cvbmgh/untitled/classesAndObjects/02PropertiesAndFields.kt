package com.cvbmgh.untitled.classesAndObjects

import javax.security.auth.Subject

/**
 * 属性与字段
 */
fun main() {
    var address = copyAddress(Address())
    println("${address.zip}")
    println("subject是否初始化${address.subject}")
}

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"

    var zip: String
        get() {
            println("get()执行")
            return "get方法的返回值"
        }
        set(value) {
            println("set() value=$value")
        }

    lateinit var subject: Subject

    init {
        subject = Subject()
    }
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.zip = address.zip
    return result
}

