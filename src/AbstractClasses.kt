/**
 * Just like java, these are the classes which you never intend to create objects from.
 * An abstract class is incomplete or useless without some conrete subclasses, from which you can
 * instantiate objects.
 * You can store state in abstract classes
 * We can have default implementation in abstract classes
 */


abstract  class Employee(val firstName: String) {
    abstract fun earning(): Double

}

/**
 * In kotlin we use : to extend or implement a class
 */
class programmer(firstName: String) : Employee(firstName) {
    override fun earning(): Double {
        return 34.45
    }

}

/**
 * We have ability to override a val(immutable) property with var(mutable)
 */

open class BaseA(open val baseProp: String){

}

class DerivedA : BaseA("") {
    private var derivedProp: String = ""
    override var baseProp: String
        get() = derivedProp
        set(value) {
            derivedProp = value
        }
}

/**
 * An interface is simply a collection of related methods that typically enable you to tell object what to do and also how to do it by default
 */
interface StudentRepo {
    fun getById(): String
    fun getResult(): String
}

class studentRepoImpl : StudentRepo {
    override fun getResult(): String {
    return ""
    }

    override fun getById(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}




fun main() {
    val programmer = programmer("Kirito")
    println(programmer.firstName)
}