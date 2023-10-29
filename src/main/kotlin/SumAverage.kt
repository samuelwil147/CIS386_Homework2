fun getInputArray(): IntArray {
    println("Enter the number of elements in the array: ")
    val n = readLine()?.toInt() ?: 0

    if (n <= 0) {
        println("Invalid input. Please enter a positive number.")
        return IntArray(0)
    }

    val numbers = IntArray(n)

    for (i in 0 until n) {
        print("Enter element ${i + 1}: ")
        numbers[i] = readLine()?.toInt() ?: 0
    }

    return numbers
}

fun calculateSumAndAverage(numbers: IntArray): Pair<Int, Double> {
    val sum = numbers.sum()
    val average = if (numbers.isNotEmpty()) sum.toDouble() / numbers.size else 0.0
    return Pair(sum, average)
}