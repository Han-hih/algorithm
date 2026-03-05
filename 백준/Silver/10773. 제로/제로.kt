fun main() {
    val n = readLine()!!.toInt()
    val stack = ArrayDeque<Int>()

    repeat(n) {
        val input = readLine()!!.toInt()

        if (input == 0) {
            stack.removeLast()
        } else {
            stack.addLast(input)
        }
    }

    println(if (stack.isEmpty()) 0 else stack.sum())
}
