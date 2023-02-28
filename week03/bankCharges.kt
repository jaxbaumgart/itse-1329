package week03

fun main() {
    print("Enter number of checks written this month >> ")
    val num = readln().toInt()
    var total = 10.0
    if (num < 20) {
        total += num * 0.1
        print("Your total is $$total.")
    }
    if (num in 20..39) {
        total += num * 0.08
        print("Your total is $$total.")
    }
    if (num in 40..59) {
        total += num * 0.06
        print("Your total is $$total.")
    }
    if (num >= 60) {
        total += num * 0.04
        print("Your total is $$total.")
    }
}