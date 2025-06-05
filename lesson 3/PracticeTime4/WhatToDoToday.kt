fun main(){
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("exited","rainy", 18))
    println(whatShouldIDoToday("tired", "cloudy", 10))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when
    {
        mood == "happy" && weather.lowercase() == "sunny" -> "Go for a walk"
        mood == "sad" && weather.lowercase() == "rainy" -> "watch a movie indoors"
        temperature > 35 "It's too hot! Stay hydrated and rest"
        mood == "tired" -> "Take a nap or do some ligth stretching"
        else -> "Stay home and read"
    }
}