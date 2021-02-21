const val APPLICATION = "Belajar Kotlin" //Variabel Constant dapat diakses global(dimanapun)
const val VERSION = "0.0.1"

fun main() {
    val firstName: String = "Martinus" //variable dapat dirubah
    val lastName: String = "Rombe" //variable tidak dapat dirubah
    val age = 21 //kotlin otomatis mengubah menjadi Int

    println("$firstName $lastName")
    println(age)

    //Nullable
    var anotherName: String? = "Inu"
    anotherName = null

    println(anotherName)
    println(anotherName?.length)


    println("$APPLICATION $VERSION") //memanggil Constant
}