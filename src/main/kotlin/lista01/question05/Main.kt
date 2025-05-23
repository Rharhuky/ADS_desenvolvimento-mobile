package lista01.question05

fun <T> decode(encodedList: List<Pair<Int, T>>): List<T> {
    val decodedList = mutableListOf<T>()
    for ((count, element) in encodedList) {
        repeat(count) {
            decodedList.add(element)
        }
    }
    return decodedList
}

fun main() {
    val encodedChars = listOf(Pair(first = 4, second = 'a'), Pair(1, 'b'),
        Pair(2, 'c'),
        Pair(2, 'a'),
        Pair(1, 'd'),
        Pair(4, 'e'))
    val decodedChars = decode(encodedChars)
    println("Codificado: $encodedChars")
    println("Decodificado: $decodedChars")
}