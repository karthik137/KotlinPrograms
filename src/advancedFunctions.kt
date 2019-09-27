import utilities.upperCaseFirstLetter

/**
 *
 * In this tutorial we will learn more about function in kotlin by digging into:
 *
 * 1) Extension functions
 * 2) Higher-order functions
 * 3) Closures
 * 4) inline functions
 */


// Member extension functions

class  ClassB {

}


/**
 * For us to invoke the toString() method of the dispatch receiver ClassA instead, we need to use a qualified this
 *
 */

class  ClassA {
    fun ClassB.exFuntion() {
        print(toString()) // calls ClassB toString()
        println(this@ClassA.toString())
    }

    fun callExFunction(classB: ClassB){
        classB.exFuntion()  // call the extension function
    }

}

/**
 * Higher_Order Functions
 */

// A higher order function is a function which takes another another function as a parameter, returns a function or does both

/**
 * Creating higher order function
 */
fun calCircumference2(radius: Double) = (2 * Math.PI) * radius

fun calArea(radius: Double): Double = (Math.PI) * Math.pow(radius, 2.0)

fun circleOperation(radius: Double, op: (Double) -> Double): Double{
    val result = op(radius)
    return result
}

/**
 * Returning a function
 */

fun multiplier(factor: Double): (Double) -> Double = {
    number -> number*factor
}

/**
 * Closures
 */

// A closure is a function that has access to variables and parameters which are defined in a n outer scope

fun printFilteredNamesByLength(length: Int){
    val names = arrayListOf("Adam", "Andrew", "Chike", "Kechi")
    val filterResult = names.filter {
        it.length == length
    }
    println(filterResult)
}


/**
 * Inline functions
 */

fun circleOperation1(radius: Double, op: (Double) -> Double){
    println("Radius is $radius")
    val result = op (radius)
    println("The result is $result")
}

fun main() {

    var firstName:String = "kirito"
    println(firstName.upperCaseFirstLetter())
    println(firstName)

    println(circleOperation(2.0, ::calArea))
    println(circleOperation(4.0, ::calCircumference2))


    /**
     *
     * We can also pass lambdas to higher order functions
     */

    // Pass lambdas to functions
    circleOperation(5.0, {
        (2 * Math.PI) * it
    })

    var doubler = multiplier(2.0)
    println(doubler(5.6))

    printFilteredNamesByLength(5)

    circleOperation1(5.3, {
        (2 * Math.PI) * it
    })
}