
class Spice(val name: String, val spiciness: String = "mild") {

    
    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extreme" -> 10
            else -> 0
        }

    
    init {
        println("Created spice: $name | Spiciness: $spiciness | Heat: $heat")
    }
}


fun makeSalt(): Spice {
    return Spice("salt")
}

fun main() {
    
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "spicy"),
        Spice("cayenne", "very spicy"),
        Spice("ginger", "medium"),
        Spice("red curry", "spicy"),
        Spice("green curry", "mild"),
        Spice("red pepper", "extreme"),
        makeSalt()
    )

    
    val mildOrSpicy = spices.filter { it.heat <= 5 }

    println("\nSpices that are spicy or less:")
    for (spice in mildOrSpicy) {
        println("${spice.name} - Heat: ${spice.heat}")
    }
}
