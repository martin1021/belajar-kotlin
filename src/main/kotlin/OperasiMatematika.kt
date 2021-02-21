fun main() {
    var result1: Int = 10 / 3
    println(result1)

    var result2: Int = 10 + 10 / 2
    println(result2)

    //Augmented Assignments
    var total = 0

    val barang1 = 100
    total = total + barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total) //total = barang1 + barang2 + barang3

    //Unary Operator

    total++ //increment
    println(total)

    total-- //decrement
    println(total)

    val suhu = -5
    println(suhu)

    val pilihan: Boolean = true
    println(!pilihan) //kebalikan(not)

}