package spices


abstract class Spice(
    val name: String,
    val spiciness: String = "mild"
) {
    abstract fun prepareSpice()
}


class SimpleSpice(name: String, spiciness: String = "mild") : Spice(name, spiciness) {
    override fun prepareSpice() {
        println("Preparing $name spice with spiciness $spiciness.")
    }
}


data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}


fun main() {
    val containers = listOf(
        SpiceContainer(SimpleSpice("Curry", "spicy")),
        SpiceContainer(SimpleSpice("Pepper", "medium")),
        SpiceContainer(SimpleSpice("Salt"))
    )

    for (container in containers) {
        println("Spice label: ${container.label}")
    }
}
