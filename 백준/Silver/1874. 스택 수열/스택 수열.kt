import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val sb = StringBuilder()

    val stack = ArrayDeque<Int>()
    var current = 1
    var possible = true

    repeat(n) {
        val target = readLine().toInt()

        while (current <= target) {
            stack.addLast(current)
            sb.append("+\n")
            current++
        }

        if (stack.isNotEmpty() && stack.last() == target) {
            stack.removeLast()
            sb.append("-\n")
        } else {
            possible = false
        }
    }

    if (possible) {
        println(sb.toString())
    } else {
        println("NO")
    }
}
