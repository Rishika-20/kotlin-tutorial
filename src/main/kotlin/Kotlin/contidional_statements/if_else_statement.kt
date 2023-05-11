package Kotlin.contidional_statements

import java.util.Scanner

class if_else_statement {

}
fun main(){

    val scan = Scanner(System.`in`)
    println("Enter the first number")
     val firstNum = scan.nextInt()
    println("Enter the second number")
    val secondNum = scan.nextInt()

    greaterstAmongTwoNumbers(firstNum,secondNum)
}

fun greaterstAmongTwoNumbers(firstNum:Int,secondNum: Int){

    val result = if (firstNum > secondNum){
        println("first number: $firstNum is greater than second number: $secondNum.")
    }else{
        println("second number: $secondNum is greater than first number: $firstNum")

    }
}