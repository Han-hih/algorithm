fun main() {
    var totalCredit = 0.0
    var totalGradePoint = 0.0

    repeat(20) {
        val (subject, credit, grade) = readLine()!!.split(" ")
        val c = credit.toDouble()

        if (grade != "P") {
            val g = when (grade) {
                "A+" -> 4.5
                "A0" -> 4.0
                "B+" -> 3.5
                "B0" -> 3.0
                "C+" -> 2.5
                "C0" -> 2.0
                "D+" -> 1.5
                "D0" -> 1.0
                "F" -> 0.0
                else -> 0.0
            }
            totalCredit += c
            totalGradePoint += c * g
        }
    }
        println(String.format("%.4f", totalGradePoint / totalCredit))
}
