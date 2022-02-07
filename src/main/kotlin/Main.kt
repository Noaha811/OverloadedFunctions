//Noah Anderson

//function for adding a residential customer
fun addCustomer(name: String, number: String): String{
    println("===================added===================")
    println("$name\n$number")
    println("===========================================")
    return "$name\n$number"
}

//function for adding a business customer
fun addCustomer(name: String, businessName: String, number: String): String{
    println("===================added===================")
    println("$name\n$businessName\n$number")
    println("===========================================")
    return "$name\n$businessName\n$number"
}

//main function to run the program
fun main() {
    var businessCustomers = arrayOf<String>()
    var residentialCustomers = arrayOf<String>()
    var userInput: String

    //loop to keep user in menu until they quit
    while(true){
        println("Enter your selection: ")
        println("1. Add residential customer")
        println("2. Add business customer")
        println("3. List residential customers")
        println("4. List business customers")
        println("5. Quit program")
        userInput = readLine()!!.toString()
        //different options based on user input
        when(userInput){
            //adds a residential customer
            "1" -> {
                print("Enter the customer's name: ")
                val name = readLine()!!.toString()
                print("Enter the customer's phone number: ")
                val number = readLine()!!.toString()
                residentialCustomers+=addCustomer(name, number)
            }
            //adds a business customer
            "2" -> {
                print("Enter the customer's name: ")
                val name = readLine()!!.toString()
                print("Enter the customer's business name: ")
                val businessName = readLine()!!.toString()
                print("Enter the customer's phone number: ")
                val number = readLine()!!.toString()
                businessCustomers+=addCustomer(name, businessName, number)

            }
            //lists all residential customers
            "3" -> {
                if(residentialCustomers.isNotEmpty()){
                    println("Residential Customers:")
                    for(x in residentialCustomers){
                        println("--------------------------------------------------------")
                        println(x)
                    }
                    println("--------------------------------------------------------")
                }else{
                    println("No residential customers!")
                }
            }
            //lists all business customers
            "4" -> {
                if(businessCustomers.isNotEmpty()){
                    println("Business Customers:")
                    for(x in businessCustomers){
                        println("--------------------------------------------------------")
                        println(x)
                    }
                    println("--------------------------------------------------------")
                }else{
                    println("No business customers!")
                }
            }
            //quits the program
            "5" ->{
                println("Goodbye!")
                break
            }
            //validates user input if user did not enter a valid menu option
            else ->{
                println("Error: Please enter a valid menu option")
                continue
            }
        }
    }
}