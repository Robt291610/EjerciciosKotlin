fun main(){
    print("Enter your mood: ")
    val mood = readLine()!!.lowercase()

    print("Enter the weather (default is sunny): ")
    val weather = readLine()?.lowercase() ?: "sunny"

    print("Enter the temperature (default is 24): ")
    val temperature = readLine()?.toIntOrNull() ?: 24

    println("Suggested activity: ${whatShouldIDoToday(mood, weather, temperature)}")

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when
    {
        isVeryHot(temperature) -> "Go swimming"
        isFreezing(mood, weather, temperature) -> "Stay in bed"
        isHappySunny(mood, weather) -> "Go for a walk"
        isSadRainy(mood, weather) -> "watch a movie indoors"
        isTired(mood) -> "Take a nap"
        isCold(weather, temperature) -> "Drink hot chocolate and read a book"
        else -> "Stay home and read"

    }

}

fun isVeryHot(temp: Int) = temp > 35
fun isFreezing(mood: String, weather: String, temp: Int) = mood == "sad" && weather == "rainy" && temp == 0
fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadRainy(mood: String, weather: String) = mood == "sad" && weather == "rainy"
fun isTired(mood: String) = mood == "tired"
fun isCold(weather: String, temp: Int) = weather == "cloudy" && temp < 10