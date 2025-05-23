package lista01.question01

fun <T> lastElement(elements: List<T>): T {
    return elements.last()
}

fun main() {
    val elements = listOf(1, 2, 3, 4, 5)
    println("Last element from $elements is ${lastElement(elements)}")
}