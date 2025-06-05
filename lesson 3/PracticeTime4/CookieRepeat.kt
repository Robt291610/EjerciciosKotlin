fun main() {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    repeat(10) { i ->
        print("Enter your birthday (or 0 to stop): ")
        val input = readLine()?.toIntOrNull() ?: 1
        if (input == 0) return@repeat
        println("Fortune ${i + 1}: ${fortunes[input % fortunes.size]}")
    }
}




