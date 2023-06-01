package Kotlin.oops.abstractexamples.onlyabstract


fun main(){

    val shape = Circle("Large Circle",5.0)
    println("Area of circle is = ${shape.area()}")

    val newShape = Rectangle("Rectangle",10.0,20.1)
    println("Area of rectangle is = ${newShape.area()}")

}