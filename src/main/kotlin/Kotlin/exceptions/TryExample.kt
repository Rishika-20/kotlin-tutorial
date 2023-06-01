package Kotlin.exceptions

import java.util.InputMismatchException

class TryExample {
}

fun main(){
    var name:String? = ""
    var id: Int? = 0
        try {
        print(" Please enter your name: ")
          name = readLine()

        print(" Please enter your id: ")
         id = Integer.valueOf(readLine())
    }
    catch (e:InputMismatchException){
        println(" Please enter a valid input.")
    }
    println("\nThe name of employee is, $name and id is, $id")
}