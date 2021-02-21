
fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values){
        total += value
    }

    println(name)
    return total
}

fun main() {
    val result = hitungTotal("Martinus",1,2,3,4,5)
    println(result)
}