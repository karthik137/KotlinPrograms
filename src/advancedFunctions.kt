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


class  ClassA {
    fun ClassB.exFuntion() {
        print(toString()) // calls ClassB toString()
    }

    fun callExFunction(classB: ClassB){
        classB.exFuntion()  // call the extension function
    }
}



fun main() {

    var firstName:String = "kirito"
    println(firstName.upperCaseFirstLetter())
    println(firstName)

    
}