package Kotlin.functional_programming

class MapExample {
}
/**
 *  the map() function is used to transform the elements of a collection
 *  by applying a transformation function to each element. It creates a
 *  new collection containing the results of the transformation.
 *
 *
 * Map take an array and transform that into an array of the same length but with each individual item transformed.
 **/

/**
 * The map() function in Kotlin is a higher-order function that supports functional programming principles
 * by providing a concise way to transform the elements of a collection without modifying the original collection.
 * It allows you to apply a transformation function to each element and collect the results in a new collection.
 *
 **/

fun mapExample1() {

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 7, 9, 11, 13, 6)

     print("Numbers are : $numbers ,  ")

    // Doubling the numbers.
    val doublingTheNumbers = numbers.map { it * 2 }
    println("\nDoubling of the numbers are : $doublingTheNumbers")

    // finding square of numbers.
    val square = numbers.map{ number -> number*number}
    println("Square of numbers are  :  $square")
}

fun main() {
    mapExample1()
}