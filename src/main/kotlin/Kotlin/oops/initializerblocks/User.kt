package Kotlin.oops.initializerblocks

/**
 * What is initializer blocks.
 *
 * An initializer block is a section of code that is used to initialize properties
 * or execute additional logic when an instance of a class is created.
 * An initializer block is enclosed in curly braces and placed within the class body.
 *
 * Where ?
 *
 * Initializer blocks can be used to initialize properties that require more complex initialization logic,
 * such as performing calculations or retrieving data from external sources.
 * They can also be used to enforce validation rules or perform additional setup tasks.
 *
 * How?
 *
 * Initializer blocks are executed after the primary constructor,
 * but before any secondary constructors. If a class has both an initializer block
 * and a secondary constructor, the secondary constructor must delegate to the
 * primary constructor using "this" keyword before the initializer block is executed.
 *
 *
 * We can have multiple number of Init or Initialization blocks.
 *
 **/
class User (name:String,var lastName:String, var id:Long){
          var name:String

          init {   // Initialized blocks.
         if (name.lowercase().startsWith('r')) {
             this.name = name
         } else {
             this.name = " User"
             println(" The name doesn't start with 'r'.")
         }
     }
}

fun main(){
    val user = User("Rishika","Kumari",1852)

    println("\nName is = ${user.name} ${user.lastName} and Id is = ${user.id}")
}