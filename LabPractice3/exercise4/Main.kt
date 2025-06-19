fun main() {
    println("=== Creación de Productos con Diferentes Constructores ===\n")
    
    try {
        
        val producto1 = Producto("LAPTOP-001", 1299.99)
        producto1.mostrarDetalles()
        
        val producto2 = Producto("MOUSE-002")
        producto2.mostrarDetalles()
        
        val producto3 = Producto()
        producto3.mostrarDetalles()
        
        val precioConDescuento = producto1.aplicarDescuento(15.0)
        println("${producto1.codigo} con 15% descuento: $$precioConDescuento")
        
        val productoInvalido = Producto("ERROR-001", -50.0)
        
    } catch (e: IllegalArgumentException) {
        println("Error al crear producto: ${e.message}")
    }
    
    val productos = listOf(
        Producto("TECLADO-003", 79.99),
        Producto("MONITOR-004"),
        Producto()
    )
    
    productos.forEachIndexed { index, producto ->
        println("Producto ${index + 1}: ${producto.codigo} - $${producto.precio}")
    }
}