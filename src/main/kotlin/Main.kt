fun main(args: Array<String>) {
    println("Even/Odd Function")
    EvenOrOdd()
    println("Palindrome Function")
    print("Enter a string: ")
    val userInput = readLine()

    if (userInput != null) {
        val result = if (Palindrome(userInput)) "is" else "is not"
        println("'$userInput' $result a palindrome.")
    } else {
        println("Invalid input. Please enter a string.")
    }
    println("User Input Array & Search")
    val (strings, searchString) = getInputArrayAndSearch()

    if (strings.isEmpty()) {
        return
    }

    val found = searchString in strings

    if (found) {
        println("'$searchString' is in the array.")
    } else {
        println("'$searchString' is not in the array.")
    }
    val numbers = getInputArray()

    if (numbers.isEmpty()) {
        return
    }

    val (sum, average) = calculateSumAndAverage(numbers)

    println("Array: ${numbers.joinToString(", ")}")
    println("Sum of elements: $sum")
    println("Average of elements: $average")

    println("Enter the number of rows: ")
    val rows = readLine()?.toInt() ?: 0

    println("Enter the number of columns: ")
    val cols = readLine()?.toInt() ?: 0

    if (rows <= 0 || cols <= 0) {
        println("Invalid input. Please enter positive integers for rows and columns.")
        return
    }

    val matrix1 = createMatrix(rows, cols)
    val matrix2 = createMatrix(rows, cols)
    val resultMatrix = subtractMatrices(matrix1, matrix2)

    println("Resultant matrix (Matrix1 - Matrix2):")
    for (row in resultMatrix) {
        println(row.joinToString("\t"))
    }
}