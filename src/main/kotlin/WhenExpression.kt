fun main() {

    val hasilUjian: Char = 'A' //perhatikan tanda petiknya !

    when (hasilUjian) {
        'A' -> println("Sempurna")
        'B' -> {
            println("Sangat Bagus")
        }
        'C' -> println("""
            Bagus
        """.trimIndent())

        'D' -> println("Kurang Bagus")
        'E' -> println("Tidak Bagus")
        else -> println("NOL")
    }

    //group when/multi option
    when (hasilUjian) {
        'A','B','C' -> {
            println("Selamat, Anda telah Lulus.")
        }
        'D','E' ->{
            println("Maaf, Anda tidak lulus.")
        }
        else -> {
            println("Drop Out")
        }
    }

    //when expression In
    println("""
        
        when expresiion in
    """.trimIndent())
    val nilai: Char = hasilUjian
    val nilaiLulus: Array<Char> = arrayOf('A','B','C')

    when (nilai) {
        in nilaiLulus -> println("Selamat, Anda telah Lulus.") //mengecek didalam array
        !in nilaiLulus -> println("Maaf, Anda tidak lulus.")

    }

    //when expression Is
    println()
    val name = "Martinus"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name in't String")
    }

    //when tanda variable
    println()
    val nilaiUjian = 90
    when {
        nilaiUjian >= 80 -> println("Bagus")
        nilaiUjian >= 60 -> println("Cukup")
        else -> println("Mengulang")

    }

}