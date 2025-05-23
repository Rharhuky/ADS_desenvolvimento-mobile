package lista01.question04

fun <T> encode(list: List<T>): List<Pair<Int, T>> {
    if (list.isEmpty()) return emptyList()
    val encodedList = mutableListOf<Pair<Int, T>>()
    var currentIndex = 0
    while (currentIndex < list.size) {
        val currentElement = list[currentIndex]
        var count = 0
        var innerIndex = currentIndex
        while (innerIndex < list.size && list[innerIndex] == currentElement) {
            count++
            innerIndex++
        }
        encodedList.add(Pair(count, currentElement))
        currentIndex = innerIndex
    }
    return encodedList
}

fun main() {
    val chars = "aaaabccaadeeee".toList()
    val encoded = encode(chars)
    println("Original: $chars")
    println("Codificado: $encoded")
}