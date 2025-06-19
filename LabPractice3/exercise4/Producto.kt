class Producto(val codigo: String, val precio: Double) {
    
    init {
        if (precio < 0) {
            throw IllegalArgumentException("El precio no puede ser negativo. Precio recibido: $precio")
        }
        println("Producto creado: $codigo - Precio: $$precio")
    }
    
    constructor(codigo: String) : this(codigo, 9.99)
    
    constructor() : this("GEN-001", 0.99)
    
    fun mostrarDetalles() {
        println("Código: $codigo | Precio: $$precio")
    }
    
    fun aplicarDescuento(porcentaje: Double): Double {
        if (porcentaje < 0 || porcentaje > 100) {
            throw IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100")
        }
        return precio * (1 - porcentaje / 100)
    }
}

