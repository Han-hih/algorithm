fun main() {
    val n = readLine()!!.toInt()

    val stack = ArrayDeque<Int>()
    var result = 0L

    repeat(n) {
        val height = readLine()!!.toInt()

        while (stack.isNotEmpty() && stack.last() <= height) {
            stack.removeLast()

        }

        result += stack.size.toLong()
        stack.addLast(height)
    }

    println(result)
}
