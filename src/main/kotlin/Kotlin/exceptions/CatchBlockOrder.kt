package Kotlin.exceptions

import java.util.*

class CatchBlockOrder {
}
fun main() {

    var firstNum: Int = 0
    var secondNum: Int = 0
    var result = 0

        while (true) {
            try {
                val scan = Scanner(System.`in`)
                println("Enter the first number:")
               firstNum = scan.nextInt()

                println("Enter the second number:")
                secondNum = scan.nextInt()
                // divide
                 result = firstNum/secondNum

            }catch (e: InputMismatchException) {
                println("Please enter a valid input!!.")
            } catch (e:ArithmeticException){
                println("Divide by zero exception occurred! : ${e.message}")
            } catch (e:Exception) {
                println("Parent exception caught!! ${e.message}")
            }
            // printing the result.
            println(" Result is: $result")
        }
    }
