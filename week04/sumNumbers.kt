package week04

fun main() {
    print("Enter a number >> ")
    val num = readln().toInt()
    var count = 0
    for (i in 1..num) {
        count += i
    }
    print("The total sum of numbers from 1 to $num is $count.")
}