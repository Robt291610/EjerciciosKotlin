package Spices

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}


object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}


abstract class Spice(
    val name: String,
    val spiciness: String,
    color: SpiceColor
) : SpiceColor by color {

    abstract fun prepareSpice()
}


class Curry(spiciness: String, color: SpiceColor = YellowSpiceColor) :
    Spice("Curry", spiciness, color),
    Grinder {

    override fun prepareSpice() {
        println("Preparing curry by grinding it...")
        grind()
    }

    override fun grind() {
        println("Grinding the curry...")
    }
}


fun main() {
    val curry = Curry("hot")
    println("Curry color is: ${curry.color}")
    curry.prepareSpice()
}
