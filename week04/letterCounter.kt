package week04
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a word >> ")
    val word = readln().lowercase()
    print("Enter a character >> ")
    val char = scanner.next().single().lowercaseChar()
    var counter = 0
    for (i in 0..word.length - 1) {
        if (word[i] == char) {
            counter++
        }
    }
    print("$char appears in $word $counter times.")
}
