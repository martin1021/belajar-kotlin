
fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun pembagian(a: Int, b: Int): Int {
    if (a == 0 || b == 0) {
        return 0
    } else {
        val total = a / b
        return total
    }
}

fun main() {
    println(jumlahkan(4,2))
    println(jumlahkan(10,2))

    val result = jumlahkan(9, 3)
    println(result)

    val result2 = pembagian(100,0)
    println(result2)
}