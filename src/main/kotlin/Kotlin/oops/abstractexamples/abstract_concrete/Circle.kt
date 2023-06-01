package Kotlin.oops.abstractexamples.abstract_concrete

// Concrete class.
class Circle(name: String,val radius :Double): Shape(name) {
    override fun area() =  Math.PI * Math.pow(radius,2.0)

    override fun concreteMethod(){
        println("Concrete method from abstract class CIRCLE!!!")
    }

    }


