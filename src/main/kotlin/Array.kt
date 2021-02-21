fun main() {

    val member: Array<String> = arrayOf("Martinus", "Rombe")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println("""
        $member
        $values
        $balances
    """.trimIndent()) //tidak bisa dibaca karena tidak memanggil index

    val firstName: String = member.get(0)
    val lastName: String = member[1]
    val nilai1: Byte = values[0]
    val nilai2: Byte = values[1]
    val nilai3: Byte = values[2]

    //memdapatkan index array
    println("""
        $firstName $lastName
        $nilai1 $nilai2 $nilai3
    """.trimIndent())


    //mengubah isi index
    values[0] = 10
    values.set(1, 50)
    values.set(2, 125)
    println("""
        ${values[0]} ${values.get(1)} $nilai3
    """.trimIndent())
}