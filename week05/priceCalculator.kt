package week05

fun main() {
    println(calculateRetail(5.00, 100.0))
    println(calculateRetail(5.00, 50.0))
}

fun calculateRetail(cost: Double, markup: Double): Double {
    return cost * (1 + (markup / 100))
}