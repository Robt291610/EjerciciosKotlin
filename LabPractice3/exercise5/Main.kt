fun main() {

    val perro = Perro("Max")
    val gato = Gato("Luna")
    val pajaro = Pajaro("Piolín", "canario")
    
   
    perro.buscarPelota()
    gato.ronronear()
    pajaro.construirNido()
    
    val animales: List<Animal> = listOf(
        Perro("Buddy"),
        Gato("Whiskers"),
        Pajaro("Tweety", "jilguero"),
        Perro("Rocky"),
        Gato("Mittens"),
        Pajaro("Charlie", "loro")
    )
    
    println("Tenemos ${animales.size} animales en total\n")
    
   
    animales.forEach { animal ->
        animal.actuar()
    }
    
    for ((index, animal) in animales.withIndex()) {
        println("Animal ${index + 1}: ${animal.nombre}")
        animal.hacerSonido()
        animal.moverse()
        
        when (animal) {
            is Perro -> animal.buscarPelota()
            is Gato -> animal.ronronear()
            is Pajaro -> {
                animal.construirNido()
                println("Especie: ${animal.especie}")
            }
        }
        println()
    }
    
    println("=== Conteo por tipo de animal ===")
    val conteoPerros = animales.count { it is Perro }
    val conteoGatos = animales.count { it is Gato }
    val conteoPajaros = animales.count { it is Pajaro }
    
    println("Perros: $conteoPerros")
    println("Gatos: $conteoGatos") 
    println("Pájaros: $conteoPajaros")
}