package week03

fun main() {
    print("Enter mass of object (kilograms) >> ")
    val mass = readln().toDouble()
    val weight = mass * 9.8
    if (weight > 1000) {
        print("The object is too heavy!")
    }
    if (weight < 10) {
        print("The object is too light!")
    }
}