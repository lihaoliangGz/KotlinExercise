package com.cvbmgh.untitled.moreLanguageConstructs

fun main() {
    isT()
}

fun isT() {
    val obj = ""

    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) {
        println("Not a String")
    }
}