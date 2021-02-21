fun main() {

    var index = 0

    while (true) {
        println("Halo ke-$index")

        index++

        if (index > 10) {
            println("Break")
            break
        }
    }

    for (index in 1..10) {

        if (index % 2 == 0) {
            continue
        }

        println("Angka $index")
    }

}