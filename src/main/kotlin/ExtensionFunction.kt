fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val firstName = "Martinus"
    val lastName = "Rombe"

    println(firstName.hello())
    println(lastName.hello())

    "Inu".printHello()
}