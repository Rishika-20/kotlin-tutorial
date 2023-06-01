package Kotlin.oops.abstractexamples.abstract_concrete

class Rectangle(name:String,val length:Double, val breadth:Double): Shape(name) {

    override fun area():Double = length * breadth

    override fun concreteMethod(){
        println("Concrete method from abstract class RECTANGLE!!!")
    }

}