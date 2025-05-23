package lista01.question08

import lista01.question06.isPrime

fun listPrimesInRange(range: IntRange): List<Int> {
    val primes = mutableListOf<Int>()
    for (number in range) {
        if (number.isPrime()) {
            primes.add(number)
        }
    }
    return primes
}

fun main() {
    val range1 = 7..31
    println("Primos no intervalo $range1: ${listPrimesInRange(range1)}")
}