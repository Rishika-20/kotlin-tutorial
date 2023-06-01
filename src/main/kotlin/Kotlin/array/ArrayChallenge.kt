package Kotlin.array


fun main(){

    val max = findMinAndMax(arrayOf(10,20,30,40,5,500),true)
    val min = findMinAndMax(arrayOf(10,20,30,40,5,500),false)

    println("The maximum value is: $max")
    println("The minimum value is: $min")

}
fun findMinAndMax(numbers:Array<Int>,searchMax:Boolean):Int{
    var max = numbers[0]
    var min = max

    if(searchMax){
        for (number in numbers){
            if (number > max){
                max = number
            }
        }
        return max
    }else
        for (number in numbers){
            if (number < min){
                min = number
            }
        }
    return min
}