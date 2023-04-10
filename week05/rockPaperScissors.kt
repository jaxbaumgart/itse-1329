package week05

fun main() {
    var playing = true
    var round = 1
    var cpuWins = 0
    var userWins = 0
    var ties = 0
    while (playing == true) {
        println("Round $round")
        startGame()
        val cpu = randomNumber()
        val user = userTurn()
        displayCPU(cpu)
        val result = result(cpu, user)
        if (result == 0) {
            ties++
        } else if (result == 1) {
            userWins++
        } else {
            cpuWins++
        }
        playing = keepPlaying()
        println()
        round++
        }
    round--
    if (round < 2) {
        println("The game is over after $round round. You won: $userWins. The CPU won: $cpuWins. Ties: $ties. Goodbye!")
    } else {
        println("The game is over after $round rounds. You won: $userWins. The CPU won: $cpuWins. Ties: $ties. Goodbye!")
    }
}

fun randomNumber(): Int {
    return (1..3).random()
}

fun userTurn(): Int {
    print("Enter a choice >> ")
    var choice = readln().toInt()
    while (choice !in 1..3) {
        print("Enter a valid choice (1-3) >> ")
        choice = readln().toInt()
    }
    return choice
}

fun startGame() {
    println("These are the rules:")
    println("Rock is 1.")
    println("Paper is 2.")
    println("Scissors is 3.")
}

fun displayCPU(cpu: Int) {
    if (cpu == 1) {
        println("CPU chose rock.")
    } else if (cpu == 2) {
        println("CPU chose paper.")
    } else {
        println("CPU chose scissors.")
    }
}

fun result(cpu: Int, user: Int): Int {
    if (cpu == user) {
        print("Tie! ")
        if (user == 1) {
            println("You both chose rock.")
        } else if (user == 2) {
            println("You both chose paper.")
        } else {
            println("You both chose scissors.")
        }
        return 0
    } else if (cpu == 1) {
        if (user == 2) {
            println("You win! Paper covers rock.")
            return 1
        } else {
            println("You lose! Rock crushes scissors.")
            return 2
        }
    } else if (cpu == 2) {
        if (user == 1) {
            println("You lose! Paper covers rock.")
            return 2
        } else {
            println("You win! Scissors cuts paper.")
            return 1
        }
    } else {
        if (user == 1) {
            println("You win! Rock crushes scissors.")
            return 1
        } else {
            println("You lose! Scissors cuts paper.")
            return 2
        }
    }
}

fun keepPlaying(): Boolean {
    print("Do you want to keep playing? (y/n) >> ")
    var result = readln().lowercase()
    while (result != "y" && result != "n") {
        print("Do you want to keep playing? Please enter 'y' for yes or 'n' for no >> ")
        result = readln().lowercase()
    }
    if (result == "y") {
        return true
    }
    return false
}