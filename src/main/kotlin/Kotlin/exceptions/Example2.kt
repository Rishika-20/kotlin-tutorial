package Kotlin.exceptions

import java.util.*

class Example2 {
}

class If_Else_Ladder {
}
fun greaterstAmongTwoNumbersNew(firstNum:Int, secondNum:Int){

    val result = if (firstNum > secondNum){
        println("first number: $firstNum is greater than second number: $secondNum.")
    }else if (firstNum == 0 && secondNum == 0 ){

        println("Both numbers are equal to 0.")
    }
    else if(firstNum == secondNum){

        println("Oops!! both the numbers holds same values.")
    }
    else{
        println("second number: $secondNum is greater than first number: $firstNum")

    }

}
fun main() {

    var firstNum: Int = 0
    var secondNum: Int = 0
    while (true) {
        try {
            val scan = Scanner(System.`in`)
            println("Enter the first number:")
            firstNum = scan.nextInt()
            println("Enter the second number:")
            secondNum = scan.nextInt()
        } catch (e: InputMismatchException) {
            println("Please enter a valid input!!")
        }
        greaterstAmongTwoNumbersNew(firstNum, secondNum)
    }
}