package com.cvbmgh.untitled.classesAndObjects

/**
 * 可见性修饰符
 */
fun main() {
    //var ca = CA(1)
}

public fun bax() {

}

private class bar {  // 在 05VisibilityModifiers.kt 内可见

}

internal val baz = 1  // 相同模块内可见

class CA private constructor(a: Int) {

}