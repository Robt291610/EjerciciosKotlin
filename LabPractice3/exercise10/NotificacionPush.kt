class NotificacionPush(
    private val dispositivoId: String,
    private val titulo: String,
    private val cuerpo: String,
    private val icono: String = "@"
) : Notificacion() {
    
    override fun enviar() {
        println("Enviando notificación push al dispositivo: $dispositivoId")
        println("   $icono $titulo")
        println("   $cuerpo")
        println("  Notificación push enviada correctamente\n")
    }
}