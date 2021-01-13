/**
 *
 */
fun main() {
    val person = Person("jack", 12)

    val (_, age) = person
    println("name= ,age=$age")
}

class Person {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    operator fun component1(): Any {
        return name;
    }

    operator fun component2(): Any {
        return age
    }
}