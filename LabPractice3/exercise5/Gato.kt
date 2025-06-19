class Gato(nombre: String) : Animal(nombre) {
    
    override fun hacerSonido() {
        println("$nombre dice: ¡Miau miau!")
    }
    
    override fun moverse() {
        println("$nombre camina sigilosamente con elegancia")
    }
    
    fun ronronear() {
        println("$nombre está ronroneando de felicidad")
    }
}