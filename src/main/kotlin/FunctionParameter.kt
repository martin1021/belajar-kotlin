
fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

fun sayHelloNull(firstName: String, lastName: String?){
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Martinus", "Rombe")
    sayHello("Inu", "Kunz")
    sayHello("World", "")
    println()
    sayHelloNull("Martinus", "Rombe")
    sayHelloNull("Martinus", null)
    sayHelloNull("Inu", "Kunz")
}