fun getInputArrayAndSearch(): Pair<Array<String>, String> {
    println("Enter the number of elements in the array: ")
    val n = readLine()?.toInt() ?: 0

    if (n <= 0) {
        println("Invalid input. Please enter a positive number.")
        return Pair(emptyArray(), "")
    }

    val strings = Array(n) { "" }

    for (i in 0 until n) {
        print("Enter string ${i + 1}: ")
        strings[i] = readLine() ?: ""
    }

    print("Enter the search string: ")
    val searchString = readLine() ?: ""

    return Pair(strings, searchString)
}