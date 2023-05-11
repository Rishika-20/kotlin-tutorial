package Kotlin.contidional_statements

import java.util.*

// Same as switch statement in java.
class When_Expression {
}
fun whenExample(number:Int){

    var result = when(number){
        1 -> "Rishika"
        2 -> "Harshit"
        3 -> "Reyansh"
        4 -> "Dhairya"
        5 -> "Prithu Sri"
        6 -> "Kislay"
        7 -> "Mayank"
        8 -> "Jiya"
        else -> "Please enter a valid number."
    }

    println(" You have selected the smartest one: $result")
}
fun main() {

    while (true) {
    val scan = Scanner(System.`in`)
    println("Please enter a number in between 1 to 8 :")
    val number = scan.nextInt()

    whenExample(number)
}
}