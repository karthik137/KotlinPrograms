import kotlin.IllegalArgumentException

/**
 * In java we have two kinds of exceptions
 * 1) checked
 * 2) Unchecked
 *
 * Unchecked exceptions are exceptions that are thrown because of flaws in your code.
 * They are a direct or indirect subclass of the RuntimeException superclass.
 *
 *
 * checked exceptions - try catch
 *
 *
 * Exceptions in kotlin
 *
 * In kotlin all exceptions are unchecked. In other words, they are not explicitly declared in the function signatures, as they are declared in java.
 */


fun foo(number: Int) {
    val result = try {
        if (number !=1 ){
            throw IllegalArgumentException("Error")
        }
        //print("Hey")
        true
    }catch (e: IllegalArgumentException){
        false
    }
    println(result)
}

@Throws(IllegalArgumentException::class)
fun addNumberToTwo(a: Any): Int {
    if(a !is Int) {
        throw IllegalArgumentException("Number must be an integer")
    }
    return 2 + a
}



fun main() {
    foo(3)
    println(addNumberToTwo(a = 4))
    //println(addNumberToTwo(a = 4.5))

}