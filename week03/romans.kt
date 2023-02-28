package week03

fun main() {
    print("Enter a number 1-10 >> ")
    val roman = readln().toInt()
    if (roman == 1) {
        print("$roman in roman numerals is I.")
    } else if (roman == 2) {
        print("$roman in roman numerals is II.")
    } else if (roman == 3) {
        print("$roman in roman numerals is III.")
    } else if (roman == 4) {
        print("$roman in roman numerals is IV.")
    } else if (roman == 5) {
        print("$roman in roman numerals is V.")
    } else if (roman == 6) {
        print("$roman in roman numerals is VI.")
    } else if (roman == 7) {
        print("$roman in roman numerals is VII.")
    } else if (roman == 8) {
        print("$roman in roman numerals is VIII.")
    } else if (roman == 9) {
        print("$roman in roman numerals is IX.")
    } else if (roman == 10) {
        print("$roman in roman numerals is X.")
    } else {
        print("Please enter a number 1-10.")
    }
}