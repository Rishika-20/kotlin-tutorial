package Kotlin.functions
/**
 *  functions can have default arguments and named arguments,
 *  which provide more flexibility and readability when calling functions.
 *
 **/
// Why we need name argument?

// If we are passing the argument at function calls, then the compiler will get confused that is this value for first argument
// or for others. Mainly we can say conflicts during datatypes.
/**
 * Named arguments allow us to specify function arguments by name, rather than by position.
 * This can make function calls more readable and less error-prone, particularly when there are many arguments.
 *  There are three points to keep in mind:
 *   1. positional arguments.
 *   2. Named argument.
 *   3. Named argument in any order.
 *
 **/
fun printNameAndAge(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun main(){
    printNameAndAge("Rishika", 22) // positional arguments
    printNameAndAge(name = "Reyansh", age = 10) // named arguments
    printNameAndAge(age = 14, name = "Jiya") // named arguments in different order

}
