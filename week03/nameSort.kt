package week03

fun main() {
    print("Enter name 1 >> ")
    var name1 = readln()
    print("Enter name 2 >> ")
    var name2 = readln()
    print("Enter name 3 >> ")
    var name3 = readln()
    var temp = ""
    if (name2 < name1 || name3 < name1) {
        if (name2 < name1) {
            temp = name1
            name1 = name2
            name2 = temp
        }
        if (name3 < name1) {
            temp = name1
            name1 = name3
            name3 = temp
        }
    }
    if (name3 < name2) {
        temp = name2
        name2 = name3
        name3 = temp
    }
    print("The names in alphabetical order are: $name1, $name2, $name3.")
}