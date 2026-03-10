fun main() {
    val n = readLine()!!.toInt()

    println(factorial(n))
}

fun factorial(n: Int): Long {
    return if (n <= 1) 1L else n * factorial(n - 1)
}