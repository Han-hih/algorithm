fun main() {
    val n = readLine()!!.toInt()
    val queue = ArrayDeque(readLine()!!.split(" ").map { it.toInt() }) // 대기열

    val stack = ArrayDeque<Int>() // 대기 공간

    var count = 1

    while (count <= n) {
        if (stack.isNotEmpty() && stack.last() == count) {
            stack.removeLast()
            count++
            continue
        }

        if (queue.isNotEmpty()) {
            stack.addLast(queue.removeFirst())
        } else {
            break
        }
    }

    if (count > n) println("Nice") else println("Sad")
}