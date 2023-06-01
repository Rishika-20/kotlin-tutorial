package Kotlin.functional_programming

/**
 * The filter() function is used to select elements from a collection that satisfy a given condition.
 * or,
 *the filter() function in Kotlin is used to perform filtering operations
 * on collections in an immutable and functional style. The filter() function
 * takes a predicate lambda expression as an argument and returns a new
 * collection containing only the elements that satisfy the given predicate.
 *
 * It is an functional interface(predicate)
 * Predicate<T>: Represents a predicate (a boolean-valued function)
 * that takes an argument of type T and returns a boolean value.
 *
 * Filter transforms an array into a smaller array.
 * **/
fun filterExample(){

    val numbers = listOf<Int>(10,20,30,4,5,7,9,11,13,24)

   // print("Numbers are : $numbers ,  ")

    // without using it.
    val evenWithoutIt = numbers.filter { number -> number % 2 == 0 }
    println("Even number without IT :  $evenWithoutIt")

    // finding even numbers.
    val even = numbers.filter { it % 2 == 0 }
    println("Even numbers are : $even")

    // finding even numbers.
    val odd = numbers.filter { it % 2 != 0}
    println("Odd numbers are :  $odd")

    // finding multiple of three.
    val multipleOfThree = numbers.filter { it % 3 == 0 }
    println("Multiples of three are : $multipleOfThree")

    val multipleOfTwo = numbers.filter { it % 2 == 0 }
    println("Multiples of two with no conditions : $multipleOfTwo ")

    val multipleOfTwoWithCondition = numbers.filter { it % 2 == 0 }.map { it > 20 }
    println("Multiples of two and which is greater than 20 : $multipleOfTwoWithCondition")


}
fun main(){

    filterExample()
}