package lista01.question10

import lista01.question09.End
import lista01.question09.Node
import lista01.question09.Tree

fun <T> Tree<T>.leafCount(): Int {
    return when (this) {
        is End -> 0
        is Node -> {
            if (this.left == End && this.right == End) {
                1
            } else {
                this.left.leafCount() + this.right.leafCount()
            }
        }
        else -> throw IllegalArgumentException("Unknown Tree type encountered: $this")
    }
}

fun main() {
    val treeExample =
        Node('a',
        Node('b',
            Node('d'),
            Node('e')), Node('c', End, Node('f', Node('g'), End)))
    println("Árvore: $treeExample")
    println("Número de folhas: ${treeExample.leafCount()}")
}