package week05

fun main() {
    print("Enter number of shares >> ")
    val numShares = readln().toInt()
    print("Enter purchase price per share >> ")
    val purchasePrice = readln().toDouble()
    print("Enter purchase commission paid >> ")
    val pCommission = readln().toDouble()
    print("Enter sale price per share >> ")
    val salePrice = readln().toDouble()
    print("Enter sale commission paid >> ")
    val sCommission = readln().toDouble()
    val profit = profitOrLoss(numShares, purchasePrice, pCommission, salePrice, sCommission)
    if (profit > 0) {
        println("Total profit is $$profit.")
    } else if (profit < 0) {
        println("Total loss is $$profit.")
    } else {
        println("You broke even at $0.00.")
    }

}

fun profitOrLoss(numShares: Int, purchasePrice: Double, pCommission: Double, salePrice: Double, sCommission: Double): Double {
    return ((numShares * salePrice) - sCommission) - ((numShares * purchasePrice) - pCommission)
}