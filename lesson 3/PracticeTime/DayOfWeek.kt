import java.util.Calendar

fun dayOfWeek() {
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (day) {
        Calendar.SUNDAY -> println("Today is Sunday")
        Calendar.MONDAY -> println("Today is Monday")
        Calendar.TUESDAY -> println("Today is Tuesday")
        Calendar.WEDNESDAY -> println("Today is Wednesday")
        Calendar.THURSDAY -> println("Today is Thursday")
        Calendar.FRIDAY -> println("Today is Friday")
        Calendar.SATURDAY -> println("Today is Saturday")
        else -> println("Unknown day")
    }
}

fun main() {
    println("Hello World!")
    dayOfWeek()
}