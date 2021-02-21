fun main() {
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "1")
    names.set(1, null)
    names[2] = "3"
    names[3] = "4"
    names[4] = null

    println("""
        ${names[0]}
        ${names[1]}
        ${names.size}
    """.trimIndent())

}