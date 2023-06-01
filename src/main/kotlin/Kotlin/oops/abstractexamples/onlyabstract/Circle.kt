package Kotlin.oops.abstractexamples.onlyabstract

// Concrete class.
class Circle(name: String,val radius :Double): Shape(name) {
    override fun area() =  Math.PI * Math.pow(radius,2.0)

    }


