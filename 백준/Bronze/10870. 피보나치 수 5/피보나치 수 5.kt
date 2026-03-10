fun main() {
    val n = readLine()!!.toInt()
    println(fibonacci(n))
}

fun fibonacci(n: Int): Int {
    return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
}