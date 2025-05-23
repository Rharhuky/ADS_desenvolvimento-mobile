package lista01.question13

import lista01.question09.End
import lista01.question09.Node
import lista01.question09.Tree
import lista01.question12.toCustomString

fun String.convertToTree(): Tree<Char> {
    if (this.isEmpty()) {
        return End
    }

    val valueEndIndex = this.indexOf('(')
    val nodeValue = if (valueEndIndex == -1) {
        this.single()
    } else {
        this.substring(0, valueEndIndex).single()
    }

    if (valueEndIndex == -1) {
        return Node(nodeValue, End, End)
    }

    val childrenString = this.substring(valueEndIndex + 1, this.length - 1)

    var leftChildString = ""
    var rightChildString = ""

    var commaIndex = -1
    var balance = 0

    for (i in childrenString.indices) {
        when (childrenString[i]) {
            '(' -> balance++
            ')' -> balance--
            ',' -> if (balance == 0) {
                commaIndex = i
                break
            }
        }
    }

    if (commaIndex == -1) {
        leftChildString = childrenString
    } else {
        leftChildString = childrenString.substring(0, commaIndex)
        rightChildString = childrenString.substring(commaIndex + 1)
    }

    val leftChild = if (leftChildString.isEmpty()) End else leftChildString.convertToTree()
    val rightChild = if (rightChildString.isEmpty()) End else rightChildString.convertToTree()

    return Node(nodeValue, leftChild, rightChild)
}

fun main() {
    println("\n--- Teste de Conversão de String para Árvore ---")

    val str1 = "a(b(d,e),c(,f(g)))"
    val tree1 = str1.convertToTree()
    println("String: \"$str1\"")
    println("Árvore resultante: $tree1")
    println("Verificação do formato personalizado: ${tree1.toCustomString()}")
}