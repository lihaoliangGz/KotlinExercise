package com.cvbmgh.untitled.classesAndObjects

/**
 * 枚举类
 */
fun main() {

}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}