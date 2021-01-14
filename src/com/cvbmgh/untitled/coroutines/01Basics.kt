package com.cvbmgh.untitled.coroutines

import kotlinx.coroutines.*
import kotlin.concurrent.thread

/**
 *
 */
fun main() {
    //t1()
    //t2()
    //t3()
    //t4()
    //t5()
    //t6()
    //t7()
    t8()
}

//fun main() = t2()


fun t1() {
//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
    thread {
        Thread.sleep(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)  // 阻塞主线程 2 秒钟来保证 JVM 存活
}

//桥接阻塞与非阻塞的世界
fun t2(): Unit {
    //协程构建器, 调用了 runBlocking 的主线程会一直 阻塞 直到 runBlocking 内部的协程执行完毕
    runBlocking {
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        delay(2000L)
    }
}

//等待一个作业
fun t3() {
    runBlocking {
        val job = GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        job.join()
    }
}

//结构化并发
fun t4() {
    runBlocking {
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
    }
}

//协程作用域构建器
fun t5() {
    runBlocking { // this: CoroutineScope
        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope { // 创建一个协程作用域
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope") // 这一行会在内嵌 launch 之前输出
        }

        println("Coroutine scope is over") // 这一行在内嵌 launch 执行完毕后才输出
    }
}

//提取函数重构
fun t6() {
    runBlocking {
        launch { doWorld() }
        println("Hello,")
    }
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

//协程很轻量
fun t7() {
    runBlocking {
        repeat(100_000) {
            launch {
                delay(5000L)
                print(".")
            }
        }
    }
}

//全局协程像守护线程
fun t8() {
    runBlocking {
        GlobalScope.launch {
            repeat(1000) {
                println("I'm sleeping $it")
                delay(500L)
            }
        }
        delay(1300L)
    }
}