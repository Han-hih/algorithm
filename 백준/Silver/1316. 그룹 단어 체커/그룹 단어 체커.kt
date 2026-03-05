fun main() {
    val n = readLine()!!.toInt()
    var count = 0

    repeat(n) {
        val word = readLine()!!
        val unique = mutableSetOf<Char>()
        var isGroup = true

        for (i in word.indices) {
            if (word[i] != (word.getOrNull(i - 1))) {
                if (unique.contains(word[i])) {
                    isGroup = false
                    break
                }
                unique.add(word[i])
            }
        }
        if (isGroup) count++
    }
    println(count)
}