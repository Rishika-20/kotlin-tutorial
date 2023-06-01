package Kotlin.functional_programming

/**
 *
 *  The reduce() function is used to accumulate the elements of a collection
 *  into a single value by applying a binary operation to each element and the
 *  previously accumulated result. It iterates over the elements of the collection and reduces them to a single value.
 *
 **/

/**
 *
 * the reduce() function is useful when you need to accumulate the elements of a collection into a
 * single value using a specified operation. It can be used for various operations such as
 * calculating sums, products, finding maximum or minimum values, and more.**/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val sum = numbers.reduce { acc, number ->
        acc + number
    }

    println("Sum: $sum")
}
