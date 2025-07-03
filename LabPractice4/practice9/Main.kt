/class Caja<T>(private val contenido: T?) {

    
    fun obtenerContenido(): T? {
        return contenido
    }

    
    fun estaVacia(): Boolean {
        return contenido == null
    }
}


fun main() {
    val cajaTexto = Caja("Hola mundo")       
    val cajaNumero = Caja<Int?>(null)       

    println("Contenido de cajaTexto: ${cajaTexto.obtenerContenido()}")
    println("¿cajaTexto está vacía? ${cajaTexto.estaVacia()}")

    println("Contenido de cajaNumero: ${cajaNumero.obtenerContenido()}")
    println("¿cajaNumero está vacía? ${cajaNumero.estaVacia()}")
}
