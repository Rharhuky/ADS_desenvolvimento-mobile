package lista01.question12

import lista01.question09.End
import lista01.question09.Node
import lista01.question09.Tree

fun <T> Tree<T>.toCustomString(): String {
    return when (this) {
        is End -> ""
        is Node -> {
            val leftString = this.left.toCustomString()
            val rightString = this.right.toCustomString()

            val childrenString = when {
                leftString.isEmpty() && rightString.isEmpty() -> ""
                rightString.isEmpty() -> "($leftString)"
                leftString.isEmpty() -> "(,$rightString)"
                else -> "($leftString,$rightString)"
            }
            "${this.value}$childrenString"
        }
    }
}

fun main() {
    val treeExample = Node('a', Node('b', Node('d'), Node('e')), Node('c', End, Node('f', Node('g'), End)))
    println("Árvore: $treeExample")
    println("Formato personalizado: ${treeExample.toCustomString()}")
}