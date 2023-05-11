package Kotlin.contidional_statements

import java.util.Scanner

class Nested_if_else {
}

fun identifyNumber(number:Int) {

    val result = if (number > 0) {
        println("Number is +ve.")

        if (number > 10) {
            println("Number is greater than 10.")
        } else {
            println("Number is less than 10.")
        }
    }
    else if (number < 0)
    {
        println("number is -ve.")
    }
    else println("Number is zero.")
}

fun main() {
    while (true) {
        val scan = Scanner(System.`in`)
        println("Enter the number to find the type(+ve or -ve):")
        val number = scan.nextInt()

        // calling function
        identifyNumber(number)
    }
}