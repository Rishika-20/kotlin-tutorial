package Kotlin.exceptions

import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner

//Order of CATCH() should be maintained.
class MultipleCatchBlock {
}
fun main(){
    var firstNum:Int = 0
    var secondNum:Int = 0

    while (true) {
        try {
            val scan = Scanner(System.`in`)
            println("Enter the first number:")
            firstNum = scan.nextInt()

            println("Enter the second number:")
            secondNum = scan.nextInt()
        } catch (e: InputMismatchException) {
            println("Please enter a valid input!!.")
        }
        val output = divide(firstNum, secondNum)
        println(" Result is: $output")
    }
}

fun divide(firstNum:Int,secondNum:Int): Int {
    var result = 0
        try {
            result = firstNum / secondNum
        } catch (e: InputMismatchException) {
            println("Please enter a valid number!!")
        }  catch (e: ArithmeticException) {
            println("Divide by zero occur Exception occurred!")
        }catch (e: Exception) {
            println("Parent exception caught!!")
        }finally {
            println("I am finally block, I will execute anyhow!!")
        }
        return result
}