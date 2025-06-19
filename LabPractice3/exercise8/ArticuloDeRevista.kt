class ArticuloDeRevista(titulo: String, autor: String, val nombreRevista: String) : 
    Publicacion(titulo, autor) {
    
    override fun mostrarInfo() {
        super.mostrarInfo() 
        println("Revista: $nombreRevista")
        println("Tipo: Artículo de revista")
    }
    
    override fun generarCita(): String {
        return "${super.generarCita()}. $nombreRevista."
    }
    
    fun esDeRevistaCientifica(): Boolean {
        val revistasCientificas = listOf("Nature", "Science", "Cell", "The Lancet")
        return nombreRevista in revistasCientificas
    }
    
    fun generarReferencia(): String {
        return "$autor ($titulo). $nombreRevista."
    }
}