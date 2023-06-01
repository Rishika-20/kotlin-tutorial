package Kotlin.oops.classes

import Kotlin.oops.initializerblocks.User


class User (var name:String,var lastName:String, var id:Long) { // primary constructor.

    // Creating secondary constructor.
    // Using "  constructor " keyword.

    // Constructor(name: String,lastName: String,id: Long)
   // The above lines : It gives error and shows Primary constructor call is expected.


    // secondary constructor(constructor(name: String)) : call to primary constructors( this(name,"lastName",0))

    // If only name is passing.
     constructor(name: String): this(name,"lastName",0) {

        println("\nFirst Constructor")
    }
    // If only name and last name, we are passing then,It looks like

    constructor(name: String,lastName: String):this(name,lastName,0){
        println("Second Constructor")

    }
}

fun main(){
    val user = User("Rishika")
    val firstUser = User(name = "Java", lastName = "Tutorials")
    val userTwo = User(name = "Kotlin", lastName = "Tutorials",111)

    println("\nName is = ${user.name}")
    println("Name: = ${firstUser.name},Last Name = ${firstUser.lastName} and Id is = ${firstUser.id}")
    println("Name: = ${userTwo.name},Last Name = ${userTwo.lastName} and Id is = ${userTwo.id}")


}