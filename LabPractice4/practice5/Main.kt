class Usuario private constructor(val email: String) {

    companion object {
        fun crearDesdeEmail(email: String): Usuario? {
            return if ("@" in email) {
                Usuario(email)
            } else {
                null
            }
        }
    }
}


fun main() {
    val usuarioValido = Usuario.crearDesdeEmail("ejemplo@correo.com")
    val usuarioInvalido = Usuario.crearDesdeEmail("sinarroba.com")

    if (usuarioValido != null) {
        println("Usuario válido creado con email: ${usuarioValido.email}")
    } else {
        println("Email inválido: no se pudo crear el usuario (email válido debe contener '@').")
    }

    if (usuarioInvalido != null) {
        println("Usuario inválido fue creado, lo cual no debería pasar.")
    } else {
        println("Email inválido: no se pudo crear el usuario (email válido debe contener '@').")
    }
}
