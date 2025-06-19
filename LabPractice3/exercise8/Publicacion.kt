open class Publicacion(val titulo: String, val autor: String) {
    
    init {
        println("Nueva publicación registrada: '$titulo' por $autor")
    }
    
    open fun mostrarInfo() {
        println("Título: $titulo")
        println("Autor: $autor")
    }
    
    open fun generarCita(): String {
        return "$autor. \"$titulo\""
    }
}






