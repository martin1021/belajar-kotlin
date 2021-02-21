inline fun helo(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun helloName(
        firstName: () -> String,
        noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}


fun main() {
    println(helo { "Martinus Rombe" })
    println(helloName({ "Martinus" }, { "Rombe" }))
}