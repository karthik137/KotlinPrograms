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



fun main(){
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