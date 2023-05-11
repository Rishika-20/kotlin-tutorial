package Kotlin.strings

class RawStrings {
}
// To print multiple lines of strings we use """ """, called as raw string.
fun main(){

    var multiLineStrings =
        """
            WELCOME 
            TO 
            KOTLIN 
            TUTORIAL
            
        """.trimIndent()

    println("Raw String Example: $multiLineStrings")
}