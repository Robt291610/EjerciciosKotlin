class Pajaro(nombre: String, val especie: String) : Animal(nombre) {
    
    override fun hacerSonido() {
        println("$nombre dice: ¡Pío pío pío!")
    }
    
    override fun moverse() {
        println("$nombre vuela graciosamente por el cielo")
    }
    
    
    fun construirNido() {
        println("$nombre está construyendo su nido")
    }
    
    override fun presentarse() {
        println("Hola, soy $nombre, un $especie")
    }
}