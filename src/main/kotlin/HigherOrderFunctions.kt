fun main() {

    fun hai(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hai $nameTransformer"
    }

    val upperLambda: (String) -> String = { value: String -> value.toUpperCase() }
    println(hai("Martinus", upperLambda))

    println(hai("Inu", { value: String -> value.toLowerCase() }))

    val result = hai("Martinus Rombe") { value: String ->
        value.toUpperCase() //trailing lambda
    }


    println(result)

}