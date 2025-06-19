fun main() {
    
    
    val libro = Libro(
        titulo = "El Quijote", 
        autor = "Miguel de Cervantes", 
        numeroPaginas = 863
    )
    
    
    val articulo = ArticuloDeRevista(
        titulo = "Avances en Inteligencia Artificial", 
        autor = "Dr. Ana García", 
        nombreRevista = "Nature"
    )
    
    println("Título: ${libro.titulo}")           
    println("Autor: ${libro.autor}")             
    println("Páginas: ${libro.numeroPaginas}")  
    
    println("Título: ${articulo.titulo}")                 
    println("Autor: ${articulo.autor}")                   
    println("Revista: ${articulo.nombreRevista}")         
    
    
    
    mostrarDetallesPublicacion(libro)
    mostrarDetallesPublicacion(articulo)
    
}