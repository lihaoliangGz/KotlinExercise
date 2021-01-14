import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 取消与超时
 */
fun main() {
    t1()
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

