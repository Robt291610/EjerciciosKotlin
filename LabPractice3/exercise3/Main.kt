fun main() {
    println("=== Sistema de Gestión de Empleados ===\n")
    
    val gerente = Gerente(
        nombre = "Ana García", 
        edad = 35, 
        salarioBase = 50000.0, 
        bono = 15000.0
    )
    
    val desarrollador = Desarrollador(
        nombre = "Carlos López", 
        edad = 28, 
        salarioBase = 40000.0, 
        lenguaje = "Kotlin"
    )
    
    println("\n=== Información de Salarios ===")
    println("${gerente.nombre} (Gerente) - Salario total: $${gerente.calcularSalario()}")
    println("${desarrollador.nombre} (Desarrollador ${desarrollador.lenguaje}) - Salario total: $${desarrollador.calcularSalario()}")
}