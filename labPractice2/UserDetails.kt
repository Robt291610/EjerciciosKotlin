fun main() {
  
    val userName: String? = "Alice"
    val userEmail: String? = null
    val userBio: String? = ""

   
    println("Name: ${userName ?: "[Not provided]"}")
    println("Email: ${userEmail ?: "[Not available]"}")

    val bio = userBio?.takeIf { it.isNotBlank() } ?: "[User has no bio or it's empty]"
    println("Bio: $bio")
}
