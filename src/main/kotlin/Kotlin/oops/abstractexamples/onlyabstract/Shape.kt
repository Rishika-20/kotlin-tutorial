package Kotlin.oops.abstractexamples.onlyabstract

/**
 *
 *
 * We can have abstract and non-abstract methods or concrete methods as well inside abstract class.
 *
 *  1. Abstract class are by default open. Coz It's only use is to inherit its functionalities.
 *
 *  2. We can't create instance of abstract class. So we create instance of concrete class.
 *
 *  3.Concrete methods should be declared as open, so that any class can change their
 *    definitions as per their needs.
 *
 * **/



// Abstract class
abstract class Shape(val name:String) {
    abstract fun area():Double
}
