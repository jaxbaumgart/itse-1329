package week03

fun main() {
    print("Enter name of competitor 1 >> ")
    var name1 = readln()
    print("Enter race time of competitor 1 >> ")
    var time1 = readln().toDouble()
    print("Enter name of competitor 2 >> ")
    var name2 = readln()
    print("Enter race time of competitor 2 >> ")
    var time2 = readln().toDouble()
    print("Enter name of competitor 3 >> ")
    var name3 = readln()
    print("Enter race time of competitor 3 >> ")
    var time3 = readln().toDouble()
    var temp = 0.0
    var tempname = ""
    if (time2 < time1 || time3 < time1) {
        if (time2 < time1) {
            temp = time1
            tempname = name1
            time1 = time2
            name1 = name2
            time2 = temp
            name2 = tempname
        }
        if (time3 < time1) {
            temp = time1
            tempname = name1
            time1 = time3
            name1 = name3
            time3 = temp
            name3 = tempname
        }
    }
    if (time3 < time2) {
        temp = time2
        tempname = name2
        time2 = time3
        name2 = name3
        time3 = temp
        name3 = tempname
    }
    print("The runners finished in this order: $name1, $name2, $name3")
}