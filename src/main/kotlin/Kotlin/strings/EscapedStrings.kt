package Kotlin.strings

class EscapedStrings {
}
fun main(){
    var text1 = "Hello Coders!"
    println("String is: $text1")

    // \t is for tab or space
    var text2 = "Hello\tCoders!"
    println("String with backslash t is: $text2")

    // \n is for new line.
    var text3 = "Hello\nCoders!"
    println("String with backslash n is: $text3")


    // \b is for backspace
    var text4 = "\b Hello \bCoders \b!"
    println("String with backslash b is: $text4")


}