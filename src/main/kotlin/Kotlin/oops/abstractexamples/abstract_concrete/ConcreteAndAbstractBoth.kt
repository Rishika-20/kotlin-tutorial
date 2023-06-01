package Kotlin.oops.abstractexamples.abstract_concrete

// Abstract class
abstract class Shape(val name:String) {
    abstract fun area():Double

    open fun concreteMethod(){
         println("Concrete method from abstract class SHAPE!!!")
     }
}
