data class Libro(val titulo: String, val autor: String, val isbn: String)

fun main() {
    
    val libro1 = Libro("1984", "George Orwell", "1234567890")
    val libro2 = Libro("1984", "George Orwell", "1234567890")


    println(libro1 == libro2) 

    
    println(libro1)

    
    val libro3 = libro1.copy(titulo = "Rebelión en la granja")

    
    println(libro3)
}
