fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    
    val divisibleBy3 = numbers.filterIf { it % 3 == 0 }

    println("Numbers divisible by 3: $divisibleBy3")
}