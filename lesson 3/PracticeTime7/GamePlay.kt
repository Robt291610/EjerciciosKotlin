val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0 else (1..sides).random()
}


fun gamePlay(diceRoll: (Int) -> Int) {
    val result = diceRoll(12)
    println("You rolled a $result")
}

fun main() {
    gamePlay(rollDice2) 
}
