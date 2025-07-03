fun obtenerCoordenadas(): Pair<Int, Int> {
    return Pair(120, 75)
}


fun obtenerDatosUsuario(): Triple<String, Int, Boolean> {
    return Triple("Carlos Pérez", 28, true)
}


fun main() {
    
    val (x, y) = obtenerCoordenadas()
    println("Coordenadas obtenidas: X = $x, Y = $y")

    val (nombre, edad, estaActivo) = obtenerDatosUsuario()
    println("Datos del usuario:")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("¿Está activo?: $estaActivo")
}
