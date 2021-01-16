import kotlinx.coroutines.*

/**
 * 取消与超时
 */
fun main() {
    //t1()
    //t2()
    //t3()
    //t4()
    t5()
}

//取消协程
fun t1() {
    runBlocking {
        val job = launch {
            repeat(1000) {
                println("I'm sleep $it")
                delay(500L)
            }
        }
        delay(1300L)
        println("main: I'm tired of waiting!")
        job.cancel()  //取消该作业
        job.join() //等待作业执行结束
        println("exit")
    }
}

//正在执行计算任务的协程
fun t2() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        val job = launch(Dispatchers.Default) {
            var nextPrintTime = startTime
            var i = 0
            //while (i < 5) {
            while (isActive) {
                if (System.currentTimeMillis() >= nextPrintTime) {
                    println("i=${i++}")
                    nextPrintTime += 500L
                }
            }

        }
        println(1300L)
        println("waiting")
        job.cancelAndJoin()// 取消一个作业并且等待它结束
        println("exit")
    }
}

//在finally中释放资源 todo
fun t3() {
    runBlocking {
        val job = launch {
            try {
                repeat(1000) {
                    println("I'm sleep $it")
                    delay(500L)
                }
            } finally {
                //println("job:I'm running finally")
                withContext(NonCancellable) {
                    println("job:I'm running finally")
                    delay(1000L)
                    println("job: And I've just delayed for 1 sec because I'm non-cancellable")
                }
            }
        }
        delay(1300L)
        println("waiting")
        job.cancelAndJoin()
        println("quit")
    }
}

//超时
fun t4() {
    runBlocking {
        withTimeout(1300L) {
            repeat(1000) {
                println("I'm sleep $it")
                delay(500L)
            }
        }
    }
}

fun t5() {
    runBlocking {
        val result = withTimeoutOrNull(1300L) {
            repeat(1000) {
                println("I'm sleep $it")
                delay(500L)
            }
        }
        println("Result is $result")
    }
}


