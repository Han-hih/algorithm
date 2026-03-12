fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val coins = mutableListOf<Int>()

    repeat(N) {
        coins.add(readLine()!!.toInt())
    }

    var answer = 0
    var remain = K

    for (i in N - 1 downTo 0) {
        val coin = coins[i]
        if (coin <= remain) {
            answer += remain / coin
            remain %= coin
        }
        if (remain == 0) break
    }

    println(answer)
}