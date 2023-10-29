fun EvenOrOdd() {
    print("Enter a number: ")
    val userInput = readLine()

    try {
        val number = userInput?.toInt()
        if (number != null) {
            val result = if (number % 2 == 0) "Even" else "Odd"
            println("$number is the $result number")
        } else {
            println("Invalid input. Please enter a valid number.")
            EvenOrOdd()

        }

    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid number.")
        EvenOrOdd()
    }



}