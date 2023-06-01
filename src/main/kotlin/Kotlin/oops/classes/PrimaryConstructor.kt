package Kotlin.oops.classes

// Why we need constructor, if we have 100 variables, then it will become difficult to initialise it and use it.
// So to it easy we use constructor.

/**
 * The primary constructor is a special constructor that is declared in the class header
 * and is used to initialize properties of the class.
 *
 * the primary constructor is a powerful feature in Kotlin that allows you to define classes in a
 * concise and flexible way,while providing a convenient way to initialize class properties and
 * execute initialization logic.
 *
 * Reasons why the primary constructor is useful:
 * 1.Concise syntax
 * 2.Initialization code
 * 3.Visibility control: The primary constructor can include access modifiers such as public, private, or protected,
 *                      which can be used to control the visibility of the constructor.
 *
 * 4.Parameterized construction
 *
 * **/

class PrimaryConstructor {

}
// Primary constructor, embedded in class name itself.
class Mobile(var company: String = "Apple",
             var processor: String = "iphone 13 PRO",
             var ram: String = "8GB",
             var storage: String = "128GB") {

    fun order(){
        println("Order has been placed for $company Mobile.")
    }
    fun received(){
        println("Your $company Mobile has been delivered.")
    }
}
fun main(){
    // creating objects.
    val mobile = Mobile()

    println("Name is = ${mobile.company}")
    println("Ram is = ${mobile.ram}")
    println("Processor is = ${mobile.processor}")
    println("Storage is = ${mobile.storage}")

    mobile.order()
    mobile.received()




}
