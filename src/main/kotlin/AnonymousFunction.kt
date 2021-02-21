fun main() {

    fun hai(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hai $nameTransformer"
    }

    val upper = fun(value: String): String {
        return if (value == "") {
            "\"Kosong\""
        } else {
            value.toUpperCase()
        }
    }


    println(hai("Martinus", upper))
    println(hai("", upper))

    println(hai("", fun(value: String): String{
        return value.toLowerCase()
    }))
}