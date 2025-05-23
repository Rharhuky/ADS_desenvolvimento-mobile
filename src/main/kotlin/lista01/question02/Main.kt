package lista01.question02

fun <T> penultimate(list: List<T>): T? {
    if(list.isEmpty()) return null
    if(list.size == 1) return list.last()
    return list[list.size - 2]
}

fun main() {
    val elements = listOf(1)
    println("Penultimate element from $elements is ${penultimate(elements)}")
}