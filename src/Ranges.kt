import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashSet

// A range in kotlin is a unique type that defines a start value and an end value
// In other words, it is an interval between a start and an end value.
// Ranges in kotlin are closed, meaning that the start value and the end value are included in the range.

// The .. operator
fun main() {

    val oneToFive = 1..5
    var array = arrayOf(1,2,3,"kirito")
    var newArray = oneToFive


//    for (item in array){
//        println("item : $item")
//    }
    array = arrayOf(newArray)
    println(array.size)
    for (item in oneToFive){
        //println("item : $item is ${array[item]}")
        println("$item")
    }

    // we can also create a range of characters

    val aToZ = "a".."z"

//    for (t in aToZ. ){
//
////    }
//    aToZ.let {
//        for (item in arrayOf(it).indices){
//
//        }
//    }

    // The rangeTo() function
    // The operator .. operator can be replaced with the rangeTo() extension function to create a range.

    val oneToFiveNew = 1.rangeTo(5)

    // downTo() function

    val fiveToOne = 5.downTo(1)

    // step() function
    // This will modify the delta between each element in the range

    val oneToTenStep = 1..10 step 5

    for (item in oneToTenStep){
        println("Item : $item")
    }


    // The in operator
    // The in operator is used to ascertain whether a value is present in a given range.
    if (5 in 1..10){
        println("Yes 5 is present in the range")
    }


    // Collections in kotlin

    // Unlike in jaa, which seems to need a lot of code to achieve a little! kotlin has two variants
    // of collection:
    // 1) Mutable collections 2) Immutable collections

    // Note: Immutable collections cannot be modified and do not have helper functions

    // List
    // List is an ordered collections of elements
    // using listOf() function

    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("Chikkie", "OatsBananna Shake", "Dal Makhani")

    for (name in names) {
        println(name)
    }

    // Moreover, We can pass values of different types into the listOf() as arguments

    var listMixedTypes = listOf("Chike", 1, 4.5, 's')

    for(item in listMixedTypes){
        println(item)
    }

    // using emptyList() function
    // This function just creates an empty immutable list and returns a kotlin List interface type.

    val emptyList: List<String> = emptyList()

    println(emptyList)

    // Using the listOfNotNull() function

    // This function creates a new immutable list containing only elements that
    // are not null. Notice that this function returns a kotlin List interface type also.

    val notNullList: List<String> = listOfNotNull("1","2","3","4", null, "5")

    println("Printing notNull list : "+notNullList );

    // Using the arrayListOf() function
    // This creates mutable list and returns a Java ArrayList type.

    val stringList: ArrayList<String> = arrayListOf<String>("hello", "yellow")
    println(stringList)

    // Using mutableListOf() Function

    // To add, remove or replace values in a list, we need to make the list mutable.
    // We can use mitableListOf() function to create a mutable list.

    var mutableNames = names.toMutableList()
    mutableNames.add("Idli Chutney")
    println(mutableNames)

    //remove 1st element
    mutableNames.removeAt(0)
    println(mutableNames)
    mutableNames.set(0, "Paav Bhaji")
    println(mutableNames)


    //Sets
    // Set is an unordered collection of unique elements. In other words, It can't have any duplicates!
    //  Using setOf Function

    val mixedTypesSet = setOf(22, 4.54, "Kirito")

    var intSet: Set<Int> = setOf(1,2,3)

    println(mixedTypesSet)
    println(intSet)

    // Using hashSetOf() Function
    // Using the hashSetOf() function creates a Java HashSet collection which
    // stores elements in a hash table.
    // We can add, remove or clear elements in the set. In other words, It's mutable.

    val intHashSet: HashSet<Int> = hashSetOf(1,2,3,4,5)

    println("Printing hashSet : "+intHashSet)
    intHashSet.add(6)
    intHashSet.remove(1)

    println("Printing hashSet after performing operation : "+ intHashSet)

    // Using sortedSetOf() function
    // sortedSetOf() function creates Java treeSet

    val intsSortedSet: TreeSet<Int> = sortedSetOf(10,4,5,6,6,7,8)
    println(intsSortedSet)
    println(intsSortedSet.clear())
    println(intsSortedSet)

    // Using the linkedSetOf() function
    // This function returns a Java LinkedHashSet type.
    // This mutable set maintains a linked list of the entries in the set, in the order in which they were
    // inserted
    var intsLinkedHashSet: LinkedHashSet<Int> = linkedSetOf(5,4,5,6,4,3,21)
    //intsLinkedHashSet.remove(2)
    println(intsLinkedHashSet)


    // Maps
    // Maps associate keys to values.
    // They must be unique, but the associated values don't need to be
    val callingCodesMap: Map<Int, String> = mapOf(234 to "yukihara", 343 to "Tokyo")
    println("$callingCodesMap")

    //Collections operation Functions
    //Kotlin provides us with many useful operator functions called extension functions that can be invoked
    // on collections.

    // last() Function
    // This operator function returns the last element in a collection such as a list or set.

    val stringList1: List<String> = listOf("int", "the", "club");
    println(stringList1.last())

    //first() Function

    // first() function returns the first element of the collection

    println(stringList1.first())


    // max() Function
    // Invoking this operator function on a collection such as a list or set returns the
    // largest element.

    val intgList: List<Int> = listOf(1,3,4)

    println(intgList.max())

    // Drop function
    // Calling this operator function returns a new list or set containing all elements except the first n elements.
    println(stringList1.drop(2))
    println(stringList1)

    // Plus function
    // This operator function returns a collection containing all elements of the original
    // and then the given element if it is not already in the collection.
    println(intgList.plus(6))

    // Minus function
    // Calling this operator function will return an average number of elements in the collection
    println(intgList.average())


}