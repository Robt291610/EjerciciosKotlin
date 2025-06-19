abstract class Animal(val nombre: String) {
    
    init {
        println("Se ha creado un animal: $nombre")
    }
    
    abstract fun hacerSonido()
    abstract fun moverse()
    
    fun presentarse() {
        println("Hola, soy $nombre")
    }
}











