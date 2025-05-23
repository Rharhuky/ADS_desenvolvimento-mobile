package lista01.question03

fun <T> isPalindrome(list: List<T>): Boolean {
    return list == list.reversed()
}

fun main() {
    val palindrome = listOf(1,2,3,2,1)
    println("The list $palindrome is ${if (isPalindrome(palindrome)) "" else "not "}a palindrome")
}