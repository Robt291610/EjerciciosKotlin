fun main() {
    
    println(" CASOS DE ÉXITO:")
    
    probarCreacionUsuario("1. Constructor primario con datos válidos") {
        Usuario("juan_perez", "juan.perez@gmail.com")
    }
    
    probarCreacionUsuario("2. Constructor secundario (email automático)") {
        Usuario("maria_lopez")
    }
    
    probarCreacionUsuario("3. Usuario con email corporativo") {
        Usuario("admin", "admin@empresa.com")
    }
    
    probarCreacionUsuario("4. Usuario con email personal") {
        Usuario("carlos123", "carlos@yahoo.com")
    }
    
    probarCreacionUsuario("5. Username vacío (constructor primario)") {
        Usuario("", "test@email.com")
    }
    
    probarCreacionUsuario("6. Username vacío (constructor secundario)") {
        Usuario("")
    }
    
    probarCreacionUsuario("7. Email sin @ (constructor primario)") {
        Usuario("testuser", "emailsinArroba.com")
    }
    
    probarCreacionUsuario("8. Email con múltiples @ (constructor primario)") {
        Usuario("testuser", "test@@email.com")
    }
    
    probarCreacionUsuario("9. Username problemático (constructor secundario)") {
        Usuario("@usuario@")
    }
    
}