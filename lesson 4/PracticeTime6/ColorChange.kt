package Spices

interface Grinder {
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}


object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
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
