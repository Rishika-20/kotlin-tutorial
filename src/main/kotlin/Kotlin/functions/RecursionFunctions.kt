package Kotlin.functions

import java.util.Scanner

// when a function calls itself is called recursive function. And the technique is called recursion.
class RecursionFunctions {
}
fun main() {
    while (true) {
        val scan = Scanner(System.`in`)
        println("\nEnter a number to find factorial : ")
        val number = scan.nextInt()
        val result = factorial(number)
        println("The result is: $result")
    }
}
fun factorial(number:Int):Long {
    return if (number == 1 || number == 0) {
                1
    }
    else (if (number >=2 ){
        factorial(number - 1) * number
    }
    else {
        println(" Factorial of negative number doesn't  exists.")
    }) as Long

}