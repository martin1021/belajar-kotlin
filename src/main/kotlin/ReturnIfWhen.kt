fun main() {
    fun returnHeloIf(name: String = ""):String {
        return if (name == "") {
            "Hello Cuy!"
        } else {
            "Hello $name"
        }
    }

    fun returnHelloWhen(name: String = ""): String {
        return when(name) {
            "" -> "Hallo Cuy!"
            else -> "Hallo $name"
        }
    }


    println(returnHeloIf())
    println(returnHeloIf("Martinus"))
    println()
    println(returnHelloWhen())
    println(returnHelloWhen("Martinus"))
}