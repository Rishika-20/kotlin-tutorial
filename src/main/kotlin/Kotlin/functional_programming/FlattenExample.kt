package Kotlin.functional_programming

/**
 * the flatten() function is used to flatten a collection of nested collections
 * into a single-level collection. It takes a collection of collections as input
 * and returns a new collection that contains all the elements from the nested
 * collections in a single level.
 *
 *
 *
 * We use the flatten() function on the nestedList, which contains three inner lists.
 * The flatten() function takes the nested list and returns a new list where all the
 * elements from the inner lists are combined into a single-level list.
 *
 **/

fun main() {

    val nestedList = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))

    println(nestedList)

    val flattenedList = nestedList.flatten()

    println(flattenedList)

}


