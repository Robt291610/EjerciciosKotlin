class Usuario(val username: String, val email: String) {
    
    
    init {
       
        if (username.isBlank()) {
            throw IllegalArgumentException("El username no puede estar vacío")
        }
        
        
        if (!esEmailValido(email)) {
            throw IllegalArgumentException("El email '$email' no es válido")
        }
        
        println("Usuario creado exitosamente: $username ($email)")
    }
    
    
    constructor(username: String) : this(username, generarEmailEmpresa(username)) {
    
        println("Email generado automáticamente para $username")
    }
    
    
    companion object {
        fun esEmailValido(email: String): Boolean {
            
            return email.contains("@") && 
                   email.indexOf("@") > 0 && 
                   email.indexOf("@") < email.length - 1 &&
                   email.count { it == '@' } == 1 &&
                   !email.startsWith("@") &&
                   !email.endsWith("@")
        }
        
        fun generarEmailEmpresa(username: String): String {
            
            val emailGenerado = "${username.lowercase()}@empresa.com"
            
            if (!esEmailValido(emailGenerado)) {
                throw IllegalArgumentException("No se puede generar un email válido para el username '$username'")
            }
            
            return emailGenerado
        }
    }
    
    fun mostrarInfo() {
        println(" Username: $username")
        println(" Email: $email")
        println(" Dominio: ${obtenerDominio()}")
        println(" Es email corporativo: ${esEmailCorporativo()}")
    }
    
    fun obtenerDominio(): String {
        return email.substringAfter("@")
    }
    
    fun esEmailCorporativo(): Boolean {
        return email.endsWith("@empresa.com")
    }
    
    fun cambiarEmail(nuevoEmail: String): Usuario {
        if (!esEmailValido(nuevoEmail)) {
            throw IllegalArgumentException("El nuevo email '$nuevoEmail' no es válido")
        }
        return Usuario(username, nuevoEmail)
    }
    
    
    override fun toString(): String {
        return "Usuario(username='$username', email='$email')"
    }
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Usuario) return false
        return username == other.username && email == other.email
    }
    
    override fun hashCode(): Int {
        return username.hashCode() * 31 + email.hashCode()
    }
}


fun probarCreacionUsuario(descripcion: String, accion: () -> Usuario?) {
    println("\n$descripcion")
    println("-".repeat(descripcion.length))
    
    try {
        val usuario = accion()
        usuario?.mostrarInfo()
    } catch (e: IllegalArgumentException) {
        println(" Error: ${e.message}")
    }
}

