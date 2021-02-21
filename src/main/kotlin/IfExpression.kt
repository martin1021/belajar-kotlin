fun main() {

    val nilai = 100

    if (nilai > 99){
        println("Sempurna")
    } else if (nilai in 61..99){ //menggunakan range
        println("Lulus")
    } else {
        println("Tidak Lulus")
    }
}