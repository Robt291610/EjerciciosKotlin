abstract class Animal(val nombre: String) {
    
    init {
        println("Se ha creado un animal: $nombre")
    }
    
    abstract fun hacerSonido()
    abstract fun moverse()
    
    open fun presentarse() {
        println("Hola, soy $nombre")
    }
    
    fun actuar() {
        presentarse()
        hacerSonido()
        moverse()
        println("---")
    }
}



