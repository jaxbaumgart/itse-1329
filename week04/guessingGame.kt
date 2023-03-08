package week04

fun main() {
    val number =(0..1001).random()
    print("Guess a number >> ")
    var guess = readln().toInt()
    while (guess != number) {
        if (guess < number) {
            println("Too low, try again.")
        }
        if (guess > number) {
            println("Too high, try again.")
        }
        print("Guess a number >> ")
        guess = readln().toInt()
    }
    print("Congrats! You guessed the number! The number was $number.")
}