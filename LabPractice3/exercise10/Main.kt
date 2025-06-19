fun main() {
    
    fun enviarTodas(notificaciones: List<Notificacion>) {
    
    notificaciones.forEachIndexed { index, notificacion ->
        println("Notificación ${index + 1}:")
        notificacion.enviar()
    }
    
    println("Total de notificaciones procesadas: ${notificaciones.size}")
}

val email = NotificacionEmail(
        destinatario = "usuario@ejemplo.com",
        asunto = "Bienvenido a nuestra plataforma",
        mensaje = "Gracias por registrarte. Tu cuenta ha sido activada exitosamente."
    )
    
    val sms = NotificacionSMS(
        numeroTelefono = "+1-234-567-8900",
        mensaje = "Tu código de verificación es: 123456"
    )
    
    val pushPromocion = NotificacionPush(
        dispositivoId = "device_12345",
        titulo = "¡Oferta especial!",
        cuerpo = "50% de descuento en todos los productos. ¡No te lo pierdas!",
        icono = "🎉"
    )
    
    val pushRecordatorio = NotificacionPush(
        dispositivoId = "device_67890",
        titulo = "Recordatorio",
        cuerpo = "Tienes una cita programada para mañana a las 10:00 AM",
        icono = "⏰"
    )
    
    val emailBoletín = NotificacionEmail(
        destinatario = "suscriptor@ejemplo.com",
        asunto = "Boletín semanal - Noticias tecnológicas",
        mensaje = "Descubre las últimas tendencias en tecnología y desarrollo."
    )

    val listaNotificaciones = listOf<Notificacion>(
        email,
        sms,
        pushPromocion,
        pushRecordatorio,
        emailBoletín
    )

    enviarTodas(listaNotificaciones)
    
}