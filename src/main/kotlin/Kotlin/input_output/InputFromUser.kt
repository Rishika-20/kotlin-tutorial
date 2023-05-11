package Kotlin.input_output

import java.util.Scanner

class InputFromUser {
}
fun main(){

    print(" Please enter your name: ")
    val name:String? = readLine()

    print(" Please enter your id: ")
    val id:Int? = Integer.valueOf(readLine())

    println("\nThe name of employee is, $name and id is, $id")
}