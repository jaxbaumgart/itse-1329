fun main() {
    print("Enter the name of your favorite city >> ")
    val city = readln()
    val cityLength = city.length
    println("$city is $cityLength characters long.")
    val cityUpper = city.uppercase()
    println("$city in uppercase is $cityUpper.")
    val cityLower = city.lowercase()
    println("$city in lowercase is $cityLower.")
    val cityFirst = city[0]
    println("The first letter of $city is $cityFirst.")
}
