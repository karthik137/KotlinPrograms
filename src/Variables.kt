


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

        // Type inference
        val country = "Nigeria"
        val code = 234
        println(country)
        println(code)

        // primitive types
        // In kotlin all types are objects

        // Numbers

        // Long -64 bit
        // Int - 32 bit
        // Short - 16 bit
        // Byte - 8 bit

        // The floating types are:

        // Double - 64 bit
        // Float - 32 bit

        val myInt = 55
        val myLong = 40L
        val myFloat = 34.43F
        val myDouble = 33.75
        val myHex = 0x0f
        val myBinary = 0b010101

        // convert types

        val myLongConvert = myInt.toLong()
        println(myLongConvert)


        // Strings
        // Strings can be created with either double quotes or triple quotes.
        // In addition to that, escape characters can be used with double quotes.

        val myString = "This is a string"
        val escapeString = "This is a string with new line \n"

        // To create a string that spans multiple lines in thee source file, we use triple quotes

        val spanMultipleLines = """
           Hey Kirito. Daijobu dayo? 
        """

        println("Print string : "+spanMultipleLines)

        // kotlin also supports string interpolation or string templates
        val accountBalance = 200
        val bankMessage = "Your account balance is $accountBalance"
        println(bankMessage)

        // call methods from an interpolated string

        val name = "chike"
        val message = "The first letter in my name is ${name.first()}"
        println(message)

        val age = 40
        val anotherMessage = """
            you are ${if(age > 40){
              "old"          
        }else{
            "young"
        }
        }
        """.trimIndent()

        println(anotherMessage)

        // Arrays
        // In kotlin there are two main ways to create an array:
        // using helper function arrayOf() or the contructore Array().

        // The arrayOf function

        val myArray = arrayOf(4,5,6,7,7)
        println("Printing myArray last index : "+myArray.lastIndex)

        // Using array constructor
        val numbersArray = Array(5, { i -> i * 2 } )
        println(numbersArray[1])

    }