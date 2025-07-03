fun Int.esPar(): Boolean = this % 2 == 0

fun Int.cuadrado(): Int = this * this

fun main() {
    val numeroPar = 10
    val numeroImpar = 5

    println("$numeroPar es par: ${numeroPar.esPar()}")
    println("$numeroPar al cuadrado: ${numeroPar.cuadrado()}")

    println("$numeroImpar es par: ${numeroImpar.esPar()}")
    println("$numeroImpar al cuadrado: ${numeroImpar.cuadrado()}")
}
