fun main() {
    
    val scores: List<Int?> = listOf(10, null, 20, 15, null, 30)

    
    var totalScore = 0

    
    for (score in scores) {
        if (score != null) {
            println("Score recorded: $score")
            totalScore += score
        } else {
            println("Attempt missed.")
        }
    }

    
    println("Total score from recorded attempts: $totalScore")

   
    val nonNullScores: List<Int> = scores.filterNotNull()
    println("Non-null scores: $nonNullScores")
}
