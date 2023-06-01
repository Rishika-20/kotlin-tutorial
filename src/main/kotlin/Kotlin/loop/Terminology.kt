package Kotlin.loop

class Terminology {
}

/**
 * break is used to terminate the loop prematurely, while
 * continue is used to skip over the remaining code in the current iteration
 * of the loop and start the next iteration.
 * */

/**
 * break and continue with labels allow for more precise control over which
 * loop to break out of or continue with in nested loop scenarios, while their
 * basic forms without labels apply to the innermost loop that encloses them.
 * */
fun main() {

    println("\n-----------BREAK STATEMENT--------")
        customBreak()
    println("\n-----------BREAK WITH LABEL STATEMENT--------")
       customBreakLabel()
    println("\n-----------CONTINUE STATEMENT--------")
       customContinue()
    println("\n-----------CONTINUE WITH LABEL STATEMENT--------")
       customContinueLabel()

}

// Break
fun customBreak() {
    for(i in 1..5){
        for (j in 1..5){
            if (i == 4 && j== 3){
                break
            }
            print(" $j, ")
        }
        println()
    }
}

//  Break with Label
fun customBreakLabel() {
    for(i in 1..5){         // row
      rishika@  for (j in 1..5){    //column
            if (i == 4 && j== 3){
                break@rishika
            }
            print(" $j, ")
        }
        println()
    }
}

// Continue

fun customContinue() {
    for(i in 1..5){
        for (j in 1..5){
            if (i == 4 && j== 3){
                continue
            }
            print(" $j, ")
        }
        println()
    }
}

// Continue with  label

fun customContinueLabel() {
    for(i in 1..5){
      rishika@  for (j in 1..5){
            if (i == 4 && j== 3){
                continue@rishika
            }
          print(" $j, ")
      }
        println()
    }
}