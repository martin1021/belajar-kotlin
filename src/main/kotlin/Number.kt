fun main() {

    //Integer Number
    val umur: Byte = 30
    val maxByte = Byte.MAX_VALUE
    val minByte = Byte.MIN_VALUE

    val tinggi: Int = 200
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    val jarak: Short = 2000
    val maxShort = Short.MAX_VALUE
    val minShort = Short.MIN_VALUE

    val keseimbangan: Long = 100_000_000L
    val maxLong = Long.MAX_VALUE
    val minLong = Long.MIN_VALUE

    //Floating Point Number
    val sample: Float = 10.11F
    val maxFloat = Float.MAX_VALUE
    val minFloat= Float.MIN_VALUE

    val panjang: Double = 100.5
    val maxDouble = Double.MAX_VALUE
    val minDouble = Double.MIN_VALUE

    //Literal
    val decimalliteral: Int = 100
    val hexadecimalliteral: Int = 0xFF
    val bineryliteral: Int = 0b0001

    //Conversion
    val number: Int = 100
    val byte: Byte = number.toByte()
    val long: Long = number.toLong()
    val double: Double = number.toDouble()


    val nama = "Tipe Data "
    val max = "Max = "
    val min = "Min = "

    println(nama + "Byte")
    println("umur = $umur")
    println("$max $maxByte")
    println("$min $minByte")

    println(nama + "Int")
    println("tinggi = $tinggi")
    println("$max $maxInt")
    println("$min $minInt")

    println(nama + "Short")
    println("jarak = $jarak")
    println("$max $maxShort")
    println("$min $minShort")

    println(nama + "Long")
    println("keseimbangan = $keseimbangan")
    println("$max $maxLong")
    println("$min $minLong")

    println("Floating Point Number")
    println(nama + "Sample")
    println("Sampel = $sample")
    println("$max $maxFloat")
    println("$min $minFloat")

    println(nama + "Panjang")
    println("Panjang = $panjang")
    println("$max $minDouble")
    println("$min $minDouble")

    println("Literal")
    println(decimalliteral)
    print(hexadecimalliteral)
    println(bineryliteral)

    println("Conversion")
    println(number)
    print(byte)
    println(long)
    println(double)


}