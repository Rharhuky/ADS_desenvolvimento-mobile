package lista01.question09

interface Tree<out T> {
    override fun toString(): String
}

data class Node<out T>(
    val value: T,
    val left: Tree<T> = End,
    val right: Tree<T> = End
) : Tree<T> {
    override fun toString(): String {
        val children = if (left == End && right == End) "" else " ${left.toString()} ${right.toString()}"
        return "T(${value}$children)"
    }
}

object End : Tree<Nothing> {
    override fun toString(): String = "."
}

fun <T : Comparable<T>> Tree<T>.add(newValue: T): Tree<T> {
    return when (this) {
        is End -> Node(newValue, End, End)
        is Node -> {
            if (newValue < this.value) {
                this.copy(left = this.left.add(newValue))
            }
            else if (newValue > this.value) {
                this.copy(right = this.right.add(newValue))
            }
            else {
                this
            }
        }
        else -> throw IllegalArgumentException("Unknown Tree type: $this")
    }
}

fun main() {
    var bst: Tree<Int> = End
    bst = bst.add(50)
    bst = bst.add(30)
    bst = bst.add(70)
    bst = bst.add(20)
    bst = bst.add(40)
    bst = bst.add(60)
    bst = bst.add(80)
    bst = bst.add(30)
    println(bst)
}