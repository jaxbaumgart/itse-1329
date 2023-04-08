package week05

fun main() {
    println(startGame())
    randomNumber()
    userTurn()
}

fun randomNumber(): Int {
    return (1..3).random()
}

fun userTurn(): Int {
    println("Enter a choice >>")
    val choice = readln().lowercase()
    if (choice == "rock") {
        return 1
    } else if (choice == "paper") {
        return 2
    } else {
        return 3
    }
}

fun startGame(): String {
    return "This is Rock Paper Scissors"
}