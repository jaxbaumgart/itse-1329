fun main() {
    print("Enter the name of your favorite city >> ")
    val city = readln()
    val cityLength = city.length
    println("$city is $cityLength letters long.")
    val cityUpper = city.uppercase()
    println(cityUpper)
    val cityLower = city.lowercase()
    println(cityLower)
    val cityFirst = city[0]
    println(cityFirst)
}
