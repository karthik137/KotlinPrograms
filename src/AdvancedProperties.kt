/**
 *
 * In this tutorial we will lean more about properties and also look
 * into advanced types of classes in kotlin by exploring the following
 *
 *  - late-initialized properties
 *  - inline properties
 *  - extension properties
 *  - data, enum, nested, and sealed classes
 */


// Late-Initialized Properties

// We can declare a non-null property in kotlin as late-initialized. This means that a non-null property won't be initialized at declaration time with a value -
// but instead, it will be late initialized by a method or dependency injection

// NOTE: lateinit must be declared with var
// The property cannot be a primitive type
// the property cannot have custom getter or setter
class Presenter {
    private lateinit var  firstName: String
    constructor(firstName: String){
        this.firstName = firstName
    }
    fun getFirstName(): String {
        return this.firstName
    }
}

/**
 * inline properties
 */
class Spartan {
    inline val name: String
        get() {
        return "kirito"
    }
}


/**
 * Extension properties
 *
 * Extension function give us the ability to extend a class with new
 *  functionality without having to inherit from that class
 *  kotlin also provides a similar mechanism for properties
 *
 *  So with this new knowledge about extension properties, you'll know that if you ever wished that a class should have a property that was not available, you are free to create an extension property of that class.
 */

/**
 * Data modifier
 */

data class BlogPost (var title: String, var desc: String)

/**
 * Nested classes
 */

class OuterClass{
    class NestedClass {
        fun nestedClassFunc(){
            println("This is nested class function")
        }
    }
}

/**
 * Inner Class
 * Inner classes, on the other hand, can reference the outer class it was declared in.
 * To create am inner class, we place the inner keyword
 */

class OuterClass1() {
val value: String = "Yo"
    inner class InnerClass {
        fun innerClassFun() {
            val outerClass = this@OuterClass1
            println(outerClass.value)
        }
    }
}

/**
 * Enum Classes
 * An enum type declares a set of constants represented by identifiers
 */

enum class Country{
    NIGERIA,
    GHANA,
    CANADA
}

/**
 * Enum constructors
 */
enum class CountryNew{
    NIGERIA (234),
    USA (1),
    GHANA(233);
    val callingCode: Int
    constructor(callingCode: Int){
        this.callingCode = callingCode
    }
}

/**
 * Sealed Classes
 */

sealed class shape

class triangle : shape()

fun main() {
    var presenter: Presenter = Presenter("kirito")
    println(presenter.getFirstName())

    val countryNew = CountryNew.NIGERIA
    println(countryNew.callingCode)
    println(Country.valueOf("NIGERIA"))
    val spartan: Spartan = Spartan();
    println(spartan.name)

    // create object of blogpost
    val blog = BlogPost("TestBlog", "testDesc")
    println(blog.toString())

    //print hashcode
    println(blog.hashCode())

    //copy method
    val blogCopy = blog.copy()
    //print copy object
    println(blogCopy.toString())

    println(blogCopy.desc)
    println(blogCopy.title)
    println(blogCopy.component1())

    /**
     * Destructive declaration
     *  In destructive declaration we can assign each component to a local variable
     */

    val (title, desc) = BlogPost("title1", "testDesc1")
    println(title+ "   "+desc)

    val nestedObject = OuterClass.NestedClass()
    nestedObject.nestedClassFunc()
}