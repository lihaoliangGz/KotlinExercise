import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 *
 */
fun main() {
    //t031()
    //t032()
    //t033()
    t034()

}

//默认顺序调用
fun t031() {
    runBlocking {
        val time = measureTimeMillis {
            val one = doSomethingUsefulOne()
            val two = doSomethingUseFulTwo()
            println("the answer is ${one + two}")
        }
        println("completed in $time ms")
    }
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    return 12
}

suspend fun doSomethingUseFulTwo(): Int {
    delay(1000L)
    return 1
}

// 使用 async 并发
fun t032() {
    runBlocking {
        val time = measureTimeMillis {
            val one = async { doSomethingUsefulOne() }
            val two = async { doSomethingUseFulTwo() }
            println("result is ${one.await()} ${two.await()}")
        }
        println(" completed in $time ms")
    }
}

//惰性 async
fun t033() {
    runBlocking {
        val time = measureTimeMillis {
            val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
            val two = async(start = CoroutineStart.LAZY) { doSomethingUseFulTwo() }
            one.start()
            two.start()
            //如果我们只是在 println 中调用 await，而没有在单独的协程中调用 start，这将会导致顺序行为，
            // 直到 await 启动该协程 执行并等待至它结束，这并不是惰性的预期用例
            println("The answer is ${one.await()} ${two.await()}")
        }

        println("Completed in $time ms")
    }
}


//强烈不推荐
fun t034() {
    val time = measureTimeMillis {
        val one = somethingUsefulOneAsync()
        val two = somethingUsefulTwoAsync()
        runBlocking {
            println("answer is ${one.await()}, ${two.await()}")
        }
    }
    println("time is $time ms")
}

fun somethingUsefulOneAsync() = GlobalScope.async {
    doSomethingUsefulOne()
}

fun somethingUsefulTwoAsync() = GlobalScope.async {
    doSomethingUseFulTwo()
}

