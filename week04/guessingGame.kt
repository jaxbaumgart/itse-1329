package week04

/*
Write a program that generates a random number and asks the user to guess what the number is.
If the user’s guess is higher than the random number, the program should display “Too high, try again.”
If the user’s guess is lower than the random number, the program should display “Too low, try again.”
The program should use a loop that repeats until the user correctly guesses the random number.
*/

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