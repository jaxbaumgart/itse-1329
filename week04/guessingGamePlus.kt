package week04

fun main() {
    val number =(0..1001).random()
    var tries = 1
    print("Guess a number >> ")
    var guess = readln().toInt()
    while (guess != number) {
        if (guess < number) {
            println("Too low, try again.")
        }
        if (guess > number) {
            println("Too high, try again.")
        }
        tries++
        print("Guess a number >> ")
        guess = readln().toInt()
    }
    print("Congrats! You guessed the number in $tries tries! The number was $number.")
}