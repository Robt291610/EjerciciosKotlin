fun main() {
    println("Rolling 12-sided dice: ${rollDice(12)}")
    println("Rolling 0-sided dice: ${rollDice(0)}")
    println("Rolling 6-sided dice with rollDice2: ${rollDice2(6)}")
}

val rollDice = { sides: Int -> 
    if (sides == 0) 0 else (1..sides).random() 
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0 else (1..sides).random()
}