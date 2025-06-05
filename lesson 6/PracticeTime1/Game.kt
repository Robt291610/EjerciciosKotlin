class Game {
    var path = mutableListOf(Direction.START)

    val north: () -> Unit = {
        path.add(Direction.NORTH)
    }

    val south: () -> Unit = {
        path.add(Direction.SOUTH)
    }

    val east: () -> Unit = {
        path.add(Direction.EAST)
    }

    val west: () -> Unit = {
        path.add(Direction.WEST)
    }

    val end: () -> Boolean = {
        path.add(Direction.END)
        println("Game Over")
        println("Path: $path")
        path.clear()
        false
    }
}