fun main() {
    while(true) {
        val line = readLine()!!
        if (line == ".") break

        val s = line.dropLast(1)
        val stack = ArrayDeque<Char>()
        var valid = true

        for (c in s) {
            when (c) {
                '(', '[' -> stack.addLast(c)
                ')' -> {
                    if (stack.isEmpty() || stack.removeLast() != '(') {
                        valid = false
                        break
                    }
                }
                ']' -> {
                    if (stack.isEmpty() || stack.removeLast() != '[') {
                        valid = false
                        break
                    }
                }
            }
        }

        if (valid && stack.isEmpty()) {
            println("yes")
        } else {
            println("no")
        }
    }
}