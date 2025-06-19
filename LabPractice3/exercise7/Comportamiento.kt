fun describirComportamiento(animal: Animal) {
    
    
    when (animal) {
        is Pajaro -> {
            println("Este animal vuela alto.")
    
            println("Especie: ${animal.especie}")
            
            animal.migrar()
        }
        is Perro -> {
            
            println("Este animal es el mejor amigo del hombre.")
            
            animal.darPata()
        }
        else -> {
            
            println("Este animal tiene un comportamiento interesante.")
            
            if (animal is Gato) {
                println("¡Y es muy independiente!")
                animal.aranar() 
            }
        }
    }
}