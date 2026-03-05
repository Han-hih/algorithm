fun main() {
    val base = listOf(1, 1, 2, 2, 2, 8)
    val found = readLine()!!.split(" ").map { it.toInt() }

    val result = base.mapIndexed { i, b -> b - found[i] }
    println(result.joinToString(" "))
}