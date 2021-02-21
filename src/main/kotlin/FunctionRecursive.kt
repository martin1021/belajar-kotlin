tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
    println(value)
    return when (value) {
        1 -> total
        else -> factorialRecursive(value - 1,total * value)
    }
}

fun main() {


    println(factorialRecursive(5))

}