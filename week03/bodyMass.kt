package week03
import kotlin.math.*

fun main() {
    print("Enter your height (inches) >> ")
    val height = readln().toDouble()
    print("Enter your weight (pounds) >> ")
    val weight = readln().toDouble()
    val bmi = (weight * 703) / height.pow(2.00)
    if (bmi < 18.5) {
        print("Your BMI indicates you are underweight.")
    } else if (bmi > 25) {
        print("Your BMI indicates you are overweight.")
    } else {
        print("Your BMI indicates you have an optimal weight.")
    }
}