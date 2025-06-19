fun main() {
    
    val circulo = Circulo("Círculo", 5.0)
    
    val cuadrado = Cuadrado("Cuadrado", 4.0)
    
    circulo.imprimirNombre()
    cuadrado.imprimirNombre()
    
    val figuras: List<FiguraGeometrica> = listOf(circulo, cuadrado)
    
    for (figura in figuras) {
        println("${figura.nombre} - Área: ${figura.calcularArea()}")
    }
}