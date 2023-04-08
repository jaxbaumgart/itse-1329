package week05

fun main() {
    for (i in 1..10) {
        println(fallingDistance(i))
    }
}

fun fallingDistance(seconds: Int): Double {
    return 0.5 * (9.8 * (seconds * seconds))
}