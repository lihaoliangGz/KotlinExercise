/**
 * 委托
 */
fun main() {
    var b = BaseImpl(23)
    b.print()

    Derived(b).print()
    Derived(b).printMessage()
    Derived(b).printMessageLine()
}

interface Base {
    fun print()
    fun printMessage()
    fun printMessageLine()

}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }

    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
        println(x)
    }
}

class Derived(b: Base) : Base by b {
    override fun printMessage() {
        println("abc")
    }
}