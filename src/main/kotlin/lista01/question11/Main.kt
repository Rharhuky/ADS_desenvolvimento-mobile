package lista01.question11

import lista01.question09.End
import lista01.question09.Node
import lista01.question09.Tree

fun <T> Tree<T>.leafValues(): List<T> {
    return when (this) {
        is End -> emptyList() // Um nó vazio não tem valores de folhas
        is Node -> {
            if (this.left == End && this.right == End) {
                listOf(this.value)
            } else {
                this.left.leafValues() + this.right.leafValues()
            }
        }
    }
}

fun main() {
    val treeExample = Node('a', Node('b', Node('d'), Node('e')), Node('c', End, Node('f', Node('g'), End)))
    println("Árvore: $treeExample")
    println("Valores das folhas: ${treeExample.leafValues()}")
}