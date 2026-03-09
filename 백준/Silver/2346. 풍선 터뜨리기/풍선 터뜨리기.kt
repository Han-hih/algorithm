data class Balloon(val index: Int, val move: Int)

fun main() {
    val n = readLine()!!.toInt()
    val input = readLine()!!.split(" ").map { it.toInt() }

    val balloons = mutableListOf<Balloon>()


    for (i in 0 until n) {
        balloons.add(Balloon(i + 1, input[i]))
    }

    val result = mutableListOf<Int>()
    var index = 0

    while (balloons.isNotEmpty()) {
        val current = balloons.removeAt(index)
        result.add(current.index)

        if (balloons.isEmpty()) break

        index = if (current.move > 0) {
            (index + current.move - 1) % balloons.size
        } else {
            (index + current.move) % balloons.size
        }

        if (index < 0) index += balloons.size
    }

    println(result.joinToString(" "))
}