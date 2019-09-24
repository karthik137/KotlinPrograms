
    fun main(){

        // use val to declare a constant or var keyword to declare a variable.
        // specify the type such as string or int after the variable name
        var firstName: String = "Kiritokun"
        println(firstName)

        // you can specify the variable without type

        val lastName = "Kazuto"
        println(lastName)

        // var is used to create mutable variables

        var car = "Iron maiden"
        car = "Maruti"
        println("Printing car "+car)

        // declare variable and assign the value later
        val carName: String
        carName = "Toyata matrix"

        //NOTE: In java multiple variables can be declared in a single line.
        // But in kotlin only one variable can be declared in a single line

        // val a=1, b=2 // This won't compile
    }