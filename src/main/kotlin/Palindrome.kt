fun Palindrome(input: String): Boolean {
    val cleanedInput = input.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    val reversedInput = cleanedInput.reversed()
    return cleanedInput == reversedInput
}