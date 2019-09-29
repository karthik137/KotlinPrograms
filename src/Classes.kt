import java.lang.IllegalArgumentException

/**
 * Classes
 *
 * A class is a program unit that groups together functions and data to perform some related tasks.
 */

// By default the member variables are public
class Book{
    var title: String
    var isbn: Long

    // This is secondary constructor
    constructor(title: String, isbn: Long){
        this.title = title
        this.isbn = isbn
    }
}

/**
 * Another variant
 *
 */

// Using primary constructor
class Kitaab constructor(title: String, isbn: Long) {
    var title: String
    var isbn: Long

    /**
     * Now we are using init modifier
     * init modifier is called once the object is created
     */
    init {
        this.title = title
        this.isbn = isbn
    }
}


/**
 * Using default parameters
 */
class Pustakam constructor(var title: String = "Pustak", var isban: Long)


/**
 * class without default parameter
 */
class Pustak (var title: String = "pustak", var isban: Long)

/**
 * Creating custom getter and setter
 */

class Book1(val isbn: Long){
    var title = "default value"
    set(value) {
        if (!value.isNotEmpty()) {
            throw IllegalArgumentException("Title must not be empty")
        }
        field = value
    }
    get() {
        return field.toUpperCase()
    }
    var author = "default Author"
    set(value) {
        if (!value.isNotEmpty()) {
            throw IllegalArgumentException("Author must not be empty")
        }
        field = value
    }
    get() {
        return field.toLowerCase()
    }
}

/**
 * More on constructors
 */
// We have freedom to combine primary and secondary constructors
class Bike(val name: String, val plateNo: String) {
    var new: Boolean = true

    constructor(name: String, plateNo: String, new: Boolean): this(name, plateNo){
        this.new = new
    }
}

/**
 * We can have multiple secondary constructors inside a class
 */

class Car(val name: String, val plateNo: String) {
    var new: Boolean? = null
    var color: String = ""

    constructor(name: String, plateNo: String, new: Boolean) : this(name,  plateNo){
        this.new = new
    }

    constructor(name: String, plateNo: String, new: Boolean, color: String): this(name, plateNo, new){
        this.color = color
    }
}


/**
 * Any and Nothing Types
 */

// In kotlin, the topmost type in the hierarchy is called Any.
// This is equivalent to the java Object type
// This means that all classes in kotlin explicitly inherit from the Any type
// Any type contains three methods: equals, toString, and hashcode

// We can also utilize the Nothing class in kotlin in functions that always return an exception

fun throwException(): Nothing {
    return throw Exception("Exception message")
}

/**
 * Internal
 */
// In a project that has a module(Gradle or Maven module), a class, object, interface or function specified with the internal modifier declared
// inside that module is only accessible from within that module

internal class Account {
    val amount: Double = 0.0
}

/**
 * Smart casting
 */

// Casting means taking an oject of anothe rtype and converting it into another object type.

class CircleNew {
    var radius: Double

    constructor(radius: Double){
        this.radius = radius
    }

    fun calCircum(): Double {
        return (2 * Math.PI * radius)
    }
}

/**
 * Objects in kotlin
 *
 * Objects in kotlin are more similar to JavaScript objects than java objects.
 *
 * Characteristics of objects in kotlin
 *
 * 1) They can have properties, methods, and an init block
 * 2) These properties or methods can have visibility modifiers
 * 3) They can't have constructors (primary or secondary)
 * 4) They can extend other classes or implement an interface
 *
 *
 */

object Singleton {
    fun myFun(): Unit {
        println("This is singleton class")
    }
}

/**
 * Companion objects
 *
 * Because kotlin does not support static classes, methods or properties like the ones we have in java
 * the kotlin team provided us with a more powerful alternative called companion objects
 * A companion object is basically an object that belongs to a class.
 *  a companion object is not associated with a class instance but rather with the class itself - for example, a factory static method, which has the job of creating a class isntance.
 */


class Person private constructor (var firstName: String) {

    init {
        count++
    }
    companion object{
        var count: Int = 0
        fun create(firstName: String): Person {
            return Person(firstName)
        }
    }
}

/**
 * Companion object with a name
 */

class Dog private constructor() {
    companion object DogFactory{
        fun dogFactory(){
            println("Dog factory")
        }
    }
}

fun main(){

    val person = Person.create("kirito")
    println(person.firstName)
    println(Person.count)

    Dog.DogFactory.dogFactory()



    println(Singleton.myFun())
    val shape = CircleNew(4.5)
    if (shape is CircleNew){
        println("shape is of type circle")
        println(shape.calCircum())
    }


    val circleObj: Circle? = shape as? Circle
    // the as? operator will try to cast to the intended type, and it returns
    // null if the value can't be cast instead of throwing an exception

    //throwException()
    val account = Account()
    println(account.amount)
    var pustakam = Pustak("title1", 117L)
    println(pustakam.toString())

    var pustak = Pustak("title2", 118L)
    println(pustak.toString())

    /**
     * Property access syntax
     * In kotlin we can get a property by the class object followed by a dot operator, then the property name
     * In other words we don't have to call getter and setter methods
     */

    println(pustakam.title)

    // Changing member variable value
    pustakam.title = "title3"
    println(pustakam.title)

    var book1 = Book1(isbn = 98L)
    println(book1.isbn)
    println(book1.author)
    println(book1.title)

}