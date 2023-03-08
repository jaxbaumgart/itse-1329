package week04

/*
Write a program that will predict the size of a population of organisms.
The program should ask for the starting number of organisms, their average daily population increase (as a percentage),
and the number of days they will multiply. For example, a population might begin with two organisms,
have an average daily increase of 50 percent, and will be allowed to multiply for seven days.
The program should use a loop to display the size of the population for each day.
*/

fun main() {
    print("Enter starting number of organisms >> ")
    var population = readln().toDouble()
    while (population < 2) {
        print("Starting population must be 2 or greater >> ")
        population = readln().toDouble()
    }
    print("Enter average daily population increase (as a percentage) >> ")
    var incr = readln().toDouble() / 100
    while (incr < 0) {
        print("Daily population increase must be positive >> ")
        incr = readln().toDouble() / 100
    }
    print("Enter number of days to multiply >> ")
    var days = readln().toInt()
    while (days < 1) {
        print("Days to multiply must be 1 or greater >> ")
        days = readln().toInt()
    }
    println()
    println("Population after day 0 is $population.")
    for (i in 1..days) {
        population *= (1 + incr)
        println("Population after day $i is $population.")
    }
    println()
    print("After $days days, the population is $population.")
}