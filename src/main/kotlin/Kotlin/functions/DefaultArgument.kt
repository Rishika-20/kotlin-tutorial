package Kotlin.functions

/**
 *  functions can have default arguments and named arguments,
 *  which provide more flexibility and readability when calling functions.
 *
 **/
// Default Argument example.
/**
 *  Default arguments allow us to specify default values for function parameters,
 *  which can be overridden by the caller if necessary.
 *  This can simplify function calls by allowing us to omit arguments with default values.
 *
 * **/
fun calculateRectangleArea(length: Int, width: Int = 5): Int {
    return length * width
}
fun main() {
    println("\nDefault argument example: \n")
     val area1 = calculateRectangleArea(10) // width value will be 5 as passed in parameter.
    println("Without passing the value of width, Area is: $area1")

    // If we passed the value of width as well as length, then the value of width will get override.
    val area2 = calculateRectangleArea(20,30)
    println("Passing both the value, Area is: $area2")

}


