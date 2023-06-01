package Kotlin.oops.getters_setters

/**
 * In the getter, we use the field keyword to refer to the backing field of the property (in this case,
 * the variable storing the actual value of the name). Here, we capitalize the name before returning it.
 *
 **/

/**
 * In the setter, we use the field keyword to refer to the backing field, and value represents the new value
 * being assigned to the property. In this example, we trim any leading or trailing whitespaces from the value
 * before assigning it to the name.
 *
 * Getters and setters in Kotlin are automatically generated for var (mutable) properties,
 * but you can also provide custom implementations.
 **/
class GettersAndSetters {
    var name: String = ""

        get() {
            return field.capitalize()  // Capitalize the name before returning
        }
//        set(value) {
//            field = value.trim()  // It will remove whitespaces before setting the name
//        }

        set(value) {
            if (value.isNotEmpty()) {
                field = value
            }
            else {
                println("Name can't be empty.")
            }
        }
}


fun main() {
    val gettersAndSetters = GettersAndSetters()

    // Assigning a value to the name property will trigger the setter.
    //gettersAndSetters.name = "   Rishika Kumari  "

    gettersAndSetters.name = ""


    // Accessing the name property will trigger the getter.
    println(gettersAndSetters.name)
}
