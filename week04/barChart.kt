package week04

fun main() {
    print("Enter today's sales for store 1 >> ")
    val store1 = readln().toInt()
    print("Enter today's sales for store 2 >> ")
    val store2 = readln().toInt()
    print("Enter today's sales for store 3 >> ")
    val store3 = readln().toInt()
    print("Enter today's sales for store 4 >> ")
    val store4 = readln().toInt()
    print("Enter today's sales for store 5 >> ")
    val store5 = readln().toInt()

    println()
    println("SALES BAR CHART")
    print("Store 1 >> ")
    repeat(store1 / 100) {
        print("*")
    }
    println()
    print("Store 2 >> ")
    repeat(store2 / 100) {
        print("*")
    }
    println()
    print("Store 3 >> ")
    repeat(store3 / 100) {
        print("*")
    }
    println()
    print("Store 4 >> ")
    repeat(store4 / 100) {
        print("*")
    }
    println()
    print("Store 5 >> ")
    repeat(store5 / 100) {
        print("*")
    }
}