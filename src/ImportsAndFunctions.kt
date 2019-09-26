
// NOTE: In kotlin we can import functions, classes, interfaces, or objects
// But in java we can't directly import function or methods



fun hello(name: String): String {
    return "hello $name"
}


/**
 * In kotlin Unit is an object and is similar to void return type
 */

fun printName(name: String): Unit {
    println("$name")
}


fun calCircumference(radius: Double): Double {
    return (2 * Math.PI) * radius
}

// Single line Functions
// Single line or one-line functions are just single expressions. In this function, we get rid of the braces and use = symbol before expression


fun calCircumferenceSingleLine(radius: Double) = (2 * Math.PI) * radius

// Named parameters
// Named parameters allow more readable functions by naming the parameters that are being passed to the functions

fun sayMyFullName(firstName: String, lastName: String ){
    println("Full Name : $firstName $lastName")
}

fun sayMyFullName(firstName: String, middleName: String="N/A", lastName: String){
    println("Full Name : $firstName $middleName $lastName")
}

//Default parameters

fun calCircumference(radius: Double, pi: Double = Math.PI): Double = (2 * pi) * radius

// Unlimited arguments

// In Java we can create a method to receive an unspecified number of arguments by including an ellipses(...) after
// a type in the method's parameter list. This concept is also supported by kotlin functions with the use of the vararg modifier followed
// by the parameter name


fun printInts(vararg ints: Int): Unit {

    println("$ints")
    for (n in ints){
        println("$n")
    }
}


// NOTE: It is also possible to have parameters before and after vararg
fun printNumbers(myDouble: Double, vararg ints: Int,  myFloat: Float){
    println("MyDOuble : "+myDouble)
    println("My VarArgs : ")
    for( item in ints){
        println(item)
    }
    println("myFloat : $myFloat")
}


/**
 * Spread operator
 *
 * Let's say we want to pass an array of integers to our printNumbers() function.
 * The function expects the value to be unrolled into a list of parameters, though.
 */

fun printNumbersNew(myInt: Int, vararg ints: Int){
    println("Printing int : "+myInt)

    for (item in ints){
        println(item)
    }

}


/**
 * Return Multiple Values
 * require
 */

// Sometimes we want to return multiple values from a function. One way is to use the Pair type in kotlin to create a pair and then return it.

fun getUserNameAndState(id: Int): Pair<String?, String?> {
    require (id > 0, {"Error: id is less than 0"})
    val userNames: Map<Int, String> = mapOf(117 to "Kirito")
    val userStates: Map<Int, String> = mapOf(117 to "Asuna Chan")
    val userName = userNames[id]
    val userState = userStates[id]

    return Pair(userName, userState)
}

/**
 * Triple return values and beyond
 */

//USing  Triple type

fun getValues(): Triple<String?, String?, String?>{
    val s1: String = "kirito"
    val s2: String = "Asuna"
    val s3: String = "Yui"

    return Triple(s1, s2, s3)
}


fun main() {
    println(hello("kirito"))
    printName("Kirito")

    println(calCircumferenceSingleLine(3.4))

    // supply parameter names beforearguments

    sayMyFullName(firstName = "Kirito", lastName = "kazuto")

    // We can even change the order of parameters, But it will still give the same output

    sayMyFullName(lastName = "Kazuto", firstName = "Kirito")

    println(calCircumference(3.00,3.14))

    sayMyFullName("kirito", "daijobu", "kazuto")

    printInts(1,2,3,4,5,5,6,6,7,7)

    val arrayList: IntArray = intArrayOf(1,3,4,5)
    //val arrayList: ArrayList<Int> = arrayListOf(1,2,3,4)
    printNumbersNew(45, *arrayList)

    println(getUserNameAndState(118))

    println(getValues())
}




