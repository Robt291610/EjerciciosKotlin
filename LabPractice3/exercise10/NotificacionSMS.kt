class NotificacionSMS(
    private val numeroTelefono: String,
    private val mensaje: String
) : Notificacion() {
    
    override fun enviar() {
        println(" Enviando SMS al número: $numeroTelefono")
        println("   Mensaje: $mensaje")
        println("   SMS enviado correctamente\n")
    }

    
}