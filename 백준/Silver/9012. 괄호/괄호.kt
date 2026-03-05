fun main() {
    val n = readLine()!!.toInt()
    
    repeat(n) {
        val input = readLine()!!
        var count = 0

        for (i in input) {
            when (i) {
                '(' -> count++
                ')' -> {
                    count--
                    if (count < 0) break
                }
            }
        }
        println(if (count == 0) "YES" else "NO")
    }
}