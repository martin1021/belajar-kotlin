fun main() {
    var firstname: String = "Martinus"
    var lastname: String = "Rombe"
    var fullname: String = "Martinus Rombe"
    var address: String = """
        >Banjarbaru,
        >Kalimantan Selatan,
        >Indonesia.
    """.trimMargin(">")
    var desc: String = "Total char dari $fullname = ${fullname.length}"

    println(firstname)
    println(lastname)
    println(fullname)
    println(address)
    println(desc)
}