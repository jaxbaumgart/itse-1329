package week03

fun main() {
    print("Enter a month >> ")
    val month = readln().toInt()
    print("Enter a day >> ")
    val day = readln().toInt()
    print("Enter a year >> ")
    val year = readln().toInt()
    if (month * day == year) {
        print("This is a magic date!")
    } else {
        print("This is not a magic date :(")
    }
}