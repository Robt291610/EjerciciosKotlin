fun main() {
    val spices = listOf(
        "curry", "pepper", "cayenne", "ginger", 
        "red curry", "green curry", "red pepper"
    )


    val curriesSortedByLength = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }
    println("Curries sorted by length: $curriesSortedByLength")


    val startCAndEndE1 = spices
        .filter { it.startsWith("c") }
        .filter { it.endsWith("e") }
    println("Start with 'c' and end with 'e' (method 1): $startCAndEndE1")

    val startCAndEndE2 = spices
        .filter { it.startsWith("c") && it.endsWith("e") }
    println("Start with 'c' and end with 'e' (method 2): $startCAndEndE2")

    val firstThreeStartWithC = spices
        .take(3)
        .filter { it.startsWith("c") }
    println("First three that start with 'c': $firstThreeStartWithC")
}


