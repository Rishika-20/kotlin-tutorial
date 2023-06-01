package Kotlin.oops.classes

class Laptop {
        var company = ""
        var processor = ""
        var ram = ""
        var storage = ""
    fun order(){
            println("Order has been placed for $company laptop.")
        }
    fun received(){
        println("Your $company laptop has been delivered.")
    }

}