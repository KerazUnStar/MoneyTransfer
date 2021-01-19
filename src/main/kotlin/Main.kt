class Main {
}

val toSend: Int = 100000
var amount: Double = (toSend * 0.75) / 100
val amountStart: Int = 35000

fun main() {
    printResult()
}

fun printResult() {
    if (toSend >= amountStart) {
    var totalPrice = toSend + amount
        println("Total sum:" + totalPrice)
    } else {
        var totalPrice = toSend
        println("Total sum:" + totalPrice)
    }
}


