package week03

fun main() {
    print("Is anyone in your party vegetarian? >> ")
    val vegetarian = readln().lowercase()
    print("Is anyone in your party vegan? >> ")
    val vegan = readln().lowercase()
    print("Is anyone in your party gluten-free? >> ")
    val gluten = readln().lowercase()
    var rest1 = 1
    var rest2 = 1
    var rest3 = 1
    if (vegetarian == "yes") {
        rest1 = 0
    }
    if (vegan == "yes") {
        rest1 = 0
        rest2 = 0
        rest3 = 0
    }
    if (gluten == "yes") {
        rest1 = 0
        rest3 = 0
    }
    println("Here are your restaurant choices:")
    println("Corner Cafe")
    println("The Chef's Kitchen")
    if (rest1 == 1) {
        println("Joe's Gourmet Burgers")
    }
    if (rest2 == 1) {
        println("Main Street Pizza Company")
    }
    if (rest3 == 1) {
        println("Mama's Fine Italian")
    }

}