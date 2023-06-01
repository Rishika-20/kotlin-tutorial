package Kotlin.exceptions

import java.util.*

class exaple2 {
}
fun main() {
    var firstNum:Int
    var secondNum:Int
    var result:Int

    val scan = Scanner(System.`in`)
    println("Enter the first number:")
    firstNum = scan.nextInt()

    println("Enter the second number:")
    secondNum = scan.nextInt()
// divide
    result = firstNum / secondNum

    println("The result is = $result")
}