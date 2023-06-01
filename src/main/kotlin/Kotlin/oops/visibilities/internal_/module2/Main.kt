package Kotlin.oops.visibilities.internal_.module2

import Kotlin.oops.visibilities.internal_.module1.MyClass
import Kotlin.oops.visibilities.internal_.module1.internalFunction

class Main {
}
fun main() {
    internalFunction() // Accessing internal function from Module1

    val newClass = MyClass()
    println(newClass.name) // Accessing internal property from Module1
}
