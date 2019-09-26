import utilities.checkUserStatus

/**
 * We will be exploring following things in this tutorial
 *
 * 1) top-level functions
 * 2) lambda expressions or function literals
 * 3) anonymous functions
 * 4) local or nested functions
 * 5) infix functions
 * 6) member functions
 */


// Top level functions
/**
 * Top - level functions are functions inside a kotlin that are defined outside of any class, object or interface.
 *
 * This means that they are functions you call directly,
 */

/**
 * Lambda Expressions
 *
 * 1) It must be surrounded by curly braces {}.
 * 2) It doesn't have the fun keyword.
 * 3) There is no access modifier (private, public or protected) because it doesn't belong to any class, object oe interface
 * 4) It has no function name. In other words, It is anonymous.
 * 5) No return type is specified because it will be inferred by the compiler.
 * 6) Parameters are not surrounded by parentheses
 */

// We can assign a lambda expression to a variable and then execute it.


// Creating lambda expressions

fun lambdaExpressions() {
    val message = {
        println("Hey, Kotlin is really cool!")
    }

    message()
}

// Include parameters in the lambda expressions



// We can ignore the parameter type (already inferred by the compiler)
    val message = {
        //myString: String -> println(myString)
        myString: String -> println(myString)
    }

/**
 * To have multiple parameters, we just separate them with a comma.
 */

val addNumbers = {
    number1: Int, number2: Int ->
    println("Adding number1 and number2")
    val result = number1 + number2
    println("The result is $result")
}

val stringLength = {
    s: String -> s.length == 3
}

/**
 * The it Argument Name
 */

// We an even simplify the lambda expression further again by replacing the lambda expression argument with the auto-generated default argument name it


/**
 * Local return in lambda expressions
 * Use label
 * It instructs compiler to return from the lambda instead of the containing function surroundingFunction()
 */

fun surroundFunction() {
    val intList = listOf(1,2,3,4,5)

    intList.forEach {
        if (it % 2 == 0) {
            return@forEach
        }
    }

    println("Enf of surroundingFunction()")
}

// You can create your own variable or name tag.
fun testFunction() {
    val intList = listOf(1,2,3,4,5,6)

    intList.forEach kirito@{
        if (it % 2 == 0){
            return@kirito
        }
    }
    println("Hello World")
}


// Member Functions
/**
 * These types of functions are defined inside a class, object, or interface. Using member functions helps us to modularize our programs futher.
 */

class Circle {
    fun calculateArea(radius: Double): Double {
        require(radius > 0, {
            "Radius must be greater than 0"
        })
        return Math.PI * Math.pow(radius, 2.0)
    }
}


/**
 * Return inside anonymous function
 */

fun surroundingFunction() {
    val intList = listOf(1,2,3,4,5)
    intList.forEach( fun(number){
        if (number % 2 == 0){
            return
        }
    })
    println("End of surroundingFunction()")
}


/**
 * Local or Nested Functions
 */

fun printCircumferenceAndArea(radius: Double): Unit {
    fun calCircumference(radius: Double): Double = (
            2 * Math.PI
            )
    val circum = "%.2f".format(calCircumference(radius))

    println("Circumference of the circle is $radius")
}


/**
 * Infix functions
 */

class Student {
    var kotlinScore = 0.0

    infix fun addKotlinScore(score: Double): Unit {
        this.kotlinScore = kotlinScore + score
    }
}


fun main(){

    val circle = Circle()
    println(circle.calculateArea(5.0))

    printCircumferenceAndArea(4.5)

    val student: Student = Student()
    student addKotlinScore 95.00
    println(student.kotlinScore)

    surroundFunction()
    testFunction()

    if (checkUserStatus() == "online"){
        println("User is online")
    }

    lambdaExpressions()

    //parametersInLambdaExpression()
    message("Kirito")
    addNumbers(1,2)
    println(stringLength("kirito"))

    val stringList: List<String> = listOf("in", "the", "hello", "club","rtwww")
    println(stringList.last()) // will print club
    println(stringList.last({
        s: String -> s.length == 3
    }))

    println(stringList.last {
        it.length == 3
    })

    /**
     * Anonymous Functions
     */


    val stringList1: List<String> = listOf("in", "the", "club")
    println(stringList1.last{
        it.length == 3
    })

    val strLengThree = stringList.last(
        fun(string): Boolean {
            return string.length == 3
        }
    )

    println(strLengThree)

    /**
     * to infix function
     */
    val nigeriaCallingCodePair = 234 to "Nigeria"

    println(nigeriaCallingCodePair)


    /**
     * Create map by using to infox function
     */

    val callingCodesMap: Map<Int, String> = mapOf(234 to "Nigeria", 1 to "300")

    println(callingCodesMap)


}