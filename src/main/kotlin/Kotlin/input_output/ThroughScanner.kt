package Kotlin.input_output
import java.util.Scanner

class ThroughScanner {
}
fun main(args: Array<String>) {

    val read = Scanner(System.`in`)
    println("Enter your age:")
    var age = read.nextInt()
    println("Your age is: $age")

}