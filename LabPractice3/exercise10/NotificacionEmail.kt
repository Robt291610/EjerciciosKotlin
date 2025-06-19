class NotificacionEmail(
    private val destinatario: String,
    private val asunto: String,
    private val mensaje: String
) : Notificacion() {
    
    override fun enviar() {
        println(" Enviando email a: $destinatario")
        println("   Asunto: $asunto")
        println("   Mensaje: $mensaje")
        println("   Email enviado correctamente\n")
    }
}