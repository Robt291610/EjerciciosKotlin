class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> 0 
        }
}

fun main() {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name}")
    println("Heat level: ${spice.heat}")
}
