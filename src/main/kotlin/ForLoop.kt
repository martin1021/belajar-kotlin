fun main() {

    var arrays = arrayOf("Martinus", "Martin", "Inu", "Rombe")
    var total = 0
    for (array in arrays) {
        println("Hai, nama saya $array")
        total++
    }
    println("Total nama = $total")

    val jumlahIndex = arrays.size -1
    for (index in 0..jumlahIndex) {
        println("Index ke-$index = ${arrays.get(index)}")
    }
}