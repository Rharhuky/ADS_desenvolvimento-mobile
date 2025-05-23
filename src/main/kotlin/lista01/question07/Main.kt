package lista01.question07

fun gcd(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

fun main() {
    println("gcd(7, 5): ${gcd(7, 5)}")
    println("gcd(48, 18): ${gcd(48, 18)}")
    println("gcd(0, 5): ${gcd(0, 5)}")
    println("gcd(0, 0): ${gcd(0, 0)}")
}