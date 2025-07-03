object Logger {
    private val logs = mutableListOf<String>()

    fun log(mensaje: String) {
        logs.add(mensaje)
        println("Log: $mensaje")
    }

    fun mostrarLogs() {
        println("\nHistorial de Logs:")
        for ((index, mensaje) in logs.withIndex()) {
            println("${index + 1}. $mensaje")
        }
    }
}


fun main() {
    Logger.log("Inicio de la aplicación.")
    
    
    Logger.log("Cargando configuraciones...")
    Logger.log("Usuario autenticado correctamente.")
    Logger.log("Datos cargados desde la base de datos.")
    Logger.log("Aplicación finalizada sin errores.")

    
    Logger.mostrarLogs()
}
