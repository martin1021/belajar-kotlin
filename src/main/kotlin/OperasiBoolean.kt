fun main() {
    val benar: Boolean = true
    val salah: Boolean = false

    println("&&(DAN)")
    println(benar && benar)
    println(salah && salah)
    println(benar && salah)

    println("!=(DAN)")
    println(benar != benar)
    println(salah != salah)
    println(benar != salah)

    println("||(OR)")
    println(benar || benar)
    println(benar || salah)
    println(salah || benar)
    println(salah || salah)

    println()
    //contoh

    val nilaiUjian = 80
    val kehadiran = 81

    val syaratKelulusan1 = nilaiUjian >= 76
    val syaratKelulusan2 = kehadiran >= 80

    val syaratKelulusan = syaratKelulusan1 && syaratKelulusan2

    println(syaratKelulusan)

    val pernyataanKelulisan: Boolean = syaratKelulusan
    if (syaratKelulusan == true) {
        println("Selamat Anda Lulus")
    }else {
        println("Anda Tidak Lulus")
    }

}