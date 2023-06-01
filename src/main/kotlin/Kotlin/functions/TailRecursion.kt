package Kotlin.functions

import java.util.Scanner


/**
 * Tail recursion is a technique used in programming languages that support recursion,
 * It is used to optimize recursive function calls. A tail-recursive function is one in which the
 * last statement of the function is a recursive call to itself.
 *
 * When a tail-recursive function is called, the function call can be replaced with a jump
 * back to the beginning of the function with updated arguments,
 * rather than adding a new frame to the call stack.
 *
 * This can save memory and improve performance, particularly for functions
 * with large numbers of recursive calls.
 */


class TailRecursion {
}
fun main(){
    val scan = Scanner(System.`in`)
    println("\nEnter the number to find the factorial:")
    val number = scan.nextInt()
    val result = factorial(number)
    println("Factorial of $number is: $result")
}
tailrec fun factorial(n: Int, acc: Int = 1): Int {
    return if (n == 0) acc else factorial(n - 1, acc * n)
}


/**
 *In this version of the function, the acc parameter is used to store the intermediate results as the
 * function is called recursively. The recursive call is the last operation in the function and is the
 * only operation in the return statement, making this function tail-recursive.
 *
 * Note that we have also marked the function with the tailrec modifier, which tells the compiler to
 * optimize the function using tail recursion. If the function is not tail-recursive in the required way,
 * the compiler will generate an error.
 * **/
