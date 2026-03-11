fun main() {
    val n = readLine()!!.toInt()
    val set = HashSet<String>()
    var count = 0
    
    repeat(n) {
        val input = readLine()!!
        
        if (input == "ENTER") {
            set.clear()
        } else {
            if (!set.contains(input)) {
                set.add(input)
                count++
            }
        }
    }
    
    println(count)
}