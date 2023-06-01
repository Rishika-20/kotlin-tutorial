package Kotlin.oops.abstractexamples.abstract_concrete


fun main(){

    // Circle.
    val shape = Circle("Large Circle",5.0)
    println("Area of circle is = ${shape.area()}")
    shape.concreteMethod() // Calling concrete method.

    // Rectangle.
    val newShape = Rectangle("Rectangle",10.0,20.1)
    println("Area of rectangle is = ${newShape.area()}")
    newShape.concreteMethod() // Calling concrete method.

}