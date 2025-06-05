fun main() {
    val fishName = "salmon"  

    when (fishName.length) {
        0 -> println("Error: fish name cannot be empty.")
        in 3..12 -> println("Good fish name.")
        else -> println("OK fish name.")
    }
}