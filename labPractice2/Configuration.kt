fun main() {
    
    var settingColorTheme: String? = null
    var settingFontSize: Int? = 14  

    
    val actualColorTheme = settingColorTheme ?: "Light"
    val actualFontSize = settingFontSize ?: 12

  
    println("Applying theme: $actualColorTheme, Font size: ${actualFontSize}pt.")
}
