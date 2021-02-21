fun testBreak(){
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5){
                break@loopI
            }
            println(
                    "$i * $j = ${i * j}")
        }
    }
}

fun testContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i ==5 || j == 5){
                continue@loopI
            }
            println(
                    "$i * $j = ${i * j}")
        }
    }
}

fun  testReturn(){
    fun test(name: String, param: (String) -> Unit): Unit = param(name)
    test("") testLabel@{
        if (it == "") {
            return@testLabel
        } else {
            println("Martinus")
        }
    }
}

fun main() {
testReturn()

}