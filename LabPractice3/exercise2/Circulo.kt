class Circulo(nombre: String, val radio: Double) : FiguraGeometrica(nombre) {
    
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}