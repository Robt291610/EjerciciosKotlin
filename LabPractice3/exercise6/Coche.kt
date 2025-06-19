class Coche : Vehiculo() {
    
    override fun describir() {
        
        super.describir()
        
        println("Más específicamente, un coche de 4 ruedas.")
    }
    
    override fun arrancar() {
        super.arrancar() 
        println("Encendiendo el motor del coche y pisando el acelerador.")
    }
    
    fun tocarBocina() {
        println("¡Beep beep!")
    }
}