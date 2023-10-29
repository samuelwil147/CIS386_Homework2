fun createMatrix(rows: Int, cols: Int): Array<IntArray> {
    val matrix = Array(rows) { IntArray(cols) }

    println("Enter the elements of the matrix:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("Enter element at row $i, column $j: ")
            matrix[i][j] = readLine()?.toInt() ?: 0
        }
    }

    return matrix
}

fun subtractMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val rows = matrix1.size
    val cols = matrix1[0].size
    val resultMatrix = Array(rows) { IntArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j]
        }
    }

    return resultMatrix
}