/**
 * 委托属性
 */
fun main() {
    println(lazyValue)
    println(lazyValue)

    val myClass = MyClass()
    myClass.oldName = 42
    println(myClass.newName)

    val user = User(mapOf("name" to "Jack", "age" to 2))
    println(user.name)
    println(user.age)
}

val lazyValue: String by lazy {
    println("computed")
    "Hello"
}

class MyClass {
    var newName: Int = 0

    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
    var oldName: Int by this::newName
}

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int by map
}
