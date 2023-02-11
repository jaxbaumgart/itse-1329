import kotlin.math.*

fun main() {
    print("Enter principal interest amount >> ")
    val p = readln().toDouble()
    print("Enter annual interest rate (in decimal form) >> ")
    val r = readln().toDouble()
    print("Enter compound frequency >> ")
    val n = readln().toDouble()
    print("Enter number of years >> ")
    val t = readln().toDouble()
    var A = p * (1 + r / n).pow(n * t)
    A = (A * 100.0).roundToInt() / 100.0
    print("The amount of money in the account after $t years is $$A.")
}