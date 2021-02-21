infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    } else if (type == "LOW") {
        return this.toLowerCase()
    } else {
        return this
    }
}


fun main() {
    val result = "Martinus Rombe" to "UP" // UP or LOW
    println(result)
}