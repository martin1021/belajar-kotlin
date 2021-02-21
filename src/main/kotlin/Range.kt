fun main() {

    val range1: IntRange = 1..10
    val range2 = 11..20
    val range3 = 21..30 step 2 // kelipatan
    val range4 = 100 downTo 51 //terbalik

    println("""
        ${range1} startnya ${range1.start} lastnya ${range1.last}
        $range2 banyak isinya ${range2.count()} 
        $range3 isinya ${range3.count()} step yang digunakan ${range3.step} 
        $range4 isinya ${range4.count()}
        ${range4.contains(51)} 
        ${range4.contains(50)}
    """.trimIndent())

}