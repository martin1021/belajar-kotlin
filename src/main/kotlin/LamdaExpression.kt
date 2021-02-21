fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val testLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val fullName = "$firstName $lastName"
        fullName
    }

    val itLambda: (String) -> String = {
        "Hello $it"
    }

    val upperCase: (String) -> String = ::toUpper

    val fullName = testLambda("Martinus", "Rombe")
    println(fullName)
    println(itLambda("Inu"))
    print(upperCase("Martinus Rombe"))
}