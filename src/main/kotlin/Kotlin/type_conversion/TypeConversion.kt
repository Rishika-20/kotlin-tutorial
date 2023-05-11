package Kotlin.type_conversion

class TypeConversion {
}
// we can also do the conversion vice-versa.
// smaller to larger types and larger to smaller types.
fun main(){

    // Int to Int
     val number = 200
     println("Int number is: $number")
     val longNumber = number
    println("Long Number is: $longNumber")

    // Int to Long
    val number1 = 300
    println("Int number is: $number1")
    val longNumber2:Long = number1.toLong()
    println("Long Number is: $longNumber2")

    // Int to Byte
    val number4 = 300
    println("Int number is: $number4")
    val longNumber5:Byte = number4.toByte()
    println("Int to Byte Number is: $longNumber5")

    // Int to Short
    val number6 = 300
    println("Int number is: $number6")
    val longNumber6:Short = number6.toShort()
    println("Int to Short Number is: $longNumber6")

    // Int to Float
    val number7 = 300
    println("Int number is: $number7")
    val longNumber7:Float = number7.toFloat()
    println("Int to Float Number is: $longNumber7")

    // Int to Double
    val number8 = 300
    println("Int number is: $number8")
    val longNumber8:Double = number8.toDouble()
    println("Int to Double Number is: $longNumber8")


}