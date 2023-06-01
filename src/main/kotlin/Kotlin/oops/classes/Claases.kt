package Kotlin.oops.classes

fun main(){
    val firstLaptop = Laptop()

    /**
     * We need to initialize each variable,what if we are using 100s variables.
     *
     * So we will see it in primaryConstructor.
     *
     *  **/
    firstLaptop.company = " Dell"
    firstLaptop.ram = "8GB "
    firstLaptop.processor = "intel CORE i5"
    firstLaptop.storage = "SSD"

    println("\nName is    : ${firstLaptop.company}")
    println("RAM  is      : ${firstLaptop.ram}")
    println("Processor is : ${firstLaptop.processor}")
    println("Storage is   : ${firstLaptop.storage}\n")

    firstLaptop.order()
    firstLaptop.received()
}

