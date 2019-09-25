
fun main(){
    println("Loops and condition")

    // By default types cannot be null in kotlin
    //val name: String = null // This won't compile

    var name: String? = null
    println("Printing name before assignment : "+
    name)
    name = "Kirito"
    println("Printing name after assignment : "+
    name)

    // The safe call operator : ?
    var firstName: String? = null
    // println(firstName.length) // will not compile

    // NOTE: Kotlin is a null-safe language

    // Here we are explicitly instructing the compiler
    // to invoke the property only if the value is not null
    //  If the value is null, compiler will use the string "null"
    val v: String? = null
    println(v?.length)

    // return type of a nullable object methods is also null

    val v_return: String? = null;
    val len: Int? = v_return?.length
    println(len)


    // Bypassing the nullability check using !!.  operator
    // NOTE: It is not recommended to use !!. operator
    val v_bypass: String? = null
    //val len_bypass: Int? = v_bypass!!.length
    //println(len_bypass) // throws null pointer exeception

    //Elvis operator ?:
    // Elvis operator is used to give alternative value
    // to the variable if it is null

    val userName: String? = null
    val newUserName: String = userName ?: "no name"
    println("Printing new userName "+newUserName)


    // Kotlin has while, do-while and for loop

    // While loop
    var fuel: Int = 0
    while ( fuel < 10 ) {
        fuel++
        println("Using fuel.")
    }

    // do-while loop
    // Execute the body at least once
    fuel = 0
    do {
        println("do while")
    }while(fuel > 2)

    // for loop construct works with iteration over ranges, collections and other iterables
    // for loop
    for (a in 1..5){
        println("$a")
    }

    val numberArray = intArrayOf(1,2,3,4,5,8,6,7)

    for (value in numberArray){
        println("$value")
    }

    /**
     * We can iterate over an array to access each element's index
     * by calling withIndex() function on the array, because the withIndex() function
     * returns an iterable of IndexedValue type for each element
     *
     */

    for ((index, value) in numberArray.withIndex()){
        println("$index index value is $value")
    }

    // Using the indices property
    val numbers1 = intArrayOf(1,2,3,4,5)
    for (index in numbers1.indices){
        println("$index index value is ${numbers1[index]}")
    }



}