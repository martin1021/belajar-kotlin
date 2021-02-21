fun main() {

    var count: Int = 0
    var incrementLambda: () -> Unit = {
        println("Increment Lambda")
        count++
    }

    var incrementAnonim = fun() {
        println("Increment Anonymous")
        count++
    }

    var incrementFun = {
        println("Increment Function")
        count++
    }

    incrementLambda()
    incrementAnonim()
    incrementFun()
    print(count)
}