package Kotlin.array

/**
 * Array is collection of similar data types either of Int, String etc.
 * Array in Kotlin is mutable in nature with fixed size which means we can
 * perform both read and write operations on elements of array.
 *
 * **/
fun main() {

    // arrayOf() - creates an array of objects of a specified type.
    val number = arrayOf(1, 2, 21, 64, 89, 41,89)

    //get(index: Int) - returns the value at the specified index.
     val getValue = number.get(1) // Indexing starts from 0.
       println("Returning the first element of an array: $getValue")

    // set(index: Int, value: T) - sets the value at the specified index.
      number.set(1,100).toString()
        println("After setting the value to 100 at 0 : $number")    // check it

    //indexOf(element: T) - returns the index of the first occurrence of the specified element,
    // or -1 if the element is not found.

    val getIndex = number.indexOf(2)
    println("Index of 2 is : $getIndex")

    //    lastIndexOf(element: T) - returns the index of the last occurrence of the specified element,
    //    or -1 if the element is not found.

    val getLastIndex = number.lastIndexOf(89)
    println("If found then last index of 89 is : $getLastIndex")

    val getLastIndexifnotFound = number.lastIndexOf(99)
    println("If doesn't found then index should be -1 : $getLastIndexifnotFound")

    //copyOf() - returns a new array containing the first n elements of
    // the original array, where n is the specified size.

    val getCopyOfNumbers = number.copyOf(5).toString()  // check it
    println("Getting copy of numbers are: $getCopyOfNumbers")


    //copyOfRange(fromIndex: Int, toIndex: Int) - returns a new array
    // containing the elements from the specified range.

    val rangeArray = number.copyOfRange(1, 4)
    println("range of array is: ${rangeArray.toString()}")   // check it

    println("Size of array is: ${number.size}")

    print("$number, ") // check it
}