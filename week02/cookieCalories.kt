fun main() {
    print("Enter number of cookies eaten: ")
    val cookies = readln().toInt()
    val calPerCookie = 300 / 4
    val totalCals = cookies * calPerCookie
    print("Your calorie intake was: $totalCals calories.")
}
