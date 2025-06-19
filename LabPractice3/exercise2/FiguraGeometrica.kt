open class FiguraGeometrica(val nombre: String) {
    
    fun imprimirNombre() {
        println("Soy una figura: $nombre")
    }
    
    open fun calcularArea(): Double {
        return 0.0
    }
}



