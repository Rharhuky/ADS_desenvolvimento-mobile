package lista01.question06

fun Int.isPrime(): Boolean {
    if (this <= 1) return false
    if (this <= 3) return true
    if (this % 2 == 0 || this % 3 == 0)
        return false
    var i = 5
    while (i * i <= this) {
        if (this % i == 0 || this % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun main() {
    println("7.isPrime(): ${7.isPrime()}")
    println("2.isPrime(): ${2.isPrime()}")
    println("97.isPrime(): ${97.isPrime()}")
}