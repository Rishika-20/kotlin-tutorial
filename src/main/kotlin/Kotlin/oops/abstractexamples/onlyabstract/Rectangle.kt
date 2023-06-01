package Kotlin.oops.abstractexamples.onlyabstract

class Rectangle(name:String,val length:Double, val breadth:Double): Shape(name) {

    override fun area():Double = length * breadth
}