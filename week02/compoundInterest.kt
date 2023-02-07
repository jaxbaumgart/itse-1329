fun main() {
    print("Enter principal interest amount >> ")
    val principal = readln().toInt()
    print("Enter annual interest rate >> ")
    val interest = readln().toDouble()
    print("Enter compound frequency >> ")
    val frequency = readln().toInt()
    print("Enter number of years >> ")
    val years = readln().toInt()
    var interestTotal = (1 + interest / frequency)
    println(interestTotal)
    val loop = frequency * years
    for (i in 1..loop) {
        interestTotal *= interestTotal
    }
    println(interestTotal)
    val final = principal * interestTotal
    print("The final amount is $$final.")
}