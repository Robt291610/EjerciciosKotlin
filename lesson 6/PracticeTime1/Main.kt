fun main() {
    val game = Game()

    println("Initial Path: ${game.path}")

    game.north()
    game.east()
    game.south()
    game.west()
    game.end()

    println("Path after game ends: ${game.path}")
}