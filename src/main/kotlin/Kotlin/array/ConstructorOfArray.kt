package Kotlin.array

/**
 * Array constructor is declared with specified size and init function.
 * The init function is used to returns the elements of array with their index.
 *
 * Array(size: Int, init: (Int) -> T)
 *
 * Kotlin Array can be created using arrayOf(), intArrayOf(), charArrayOf(),
 * booleanArrayOf(), longArrayOf(), shortArrayOf(), byteArrayOf() functions.
 *
 **/
//Array(size: Int, init: (Int) -> T) - creates an array of a specified size with the provided initializer function.
fun main(args: Array<String>) {
    val squares = Array(5) { i -> i * i }

    println(squares.toString())
}