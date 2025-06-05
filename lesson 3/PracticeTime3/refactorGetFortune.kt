fun main(){
    val birthday = getBirthday()
    val fortune = getFortune(birthday)
    println("Your fortune is: $fortune")
}

fun getBirthday(): Int {
    print("Enter your birthday")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String{
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when
    {
        birthday == 28 || birthday == 31 -> "You are in for a special surprise"
        birthday in 1..7 -> "You will have an exciting week ahead"
        else -> fortunes[birthday % fortunes.size]
    }

}

