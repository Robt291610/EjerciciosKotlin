class Libro(titulo: String, autor: String, val numeroPaginas: Int) : 
    Publicacion(titulo, autor) {
    
    override fun mostrarInfo() {
        super.mostrarInfo() 
        println("Número de páginas: $numeroPaginas")
        println("Tipo: Libro")
    }
    
    override fun generarCita(): String {
        return "${super.generarCita()}. Libro, $numeroPaginas páginas."
    }
    
    fun calcularTiempoLectura(paginasPorMinuto: Int = 2): Int {
        return numeroPaginas / paginasPorMinuto
    }
    
    fun esLibroCorto(): Boolean {
        return numeroPaginas < 200
    }
}