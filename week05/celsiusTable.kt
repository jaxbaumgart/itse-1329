package week05

fun main() {
    println("Fahrenheit\tCelsius")
    for (num in 1..20) {
        val celsius = celsius(num.toDouble())
        println("$num\t\t\t$celsius")
    }
}

fun celsius(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32.0)
}