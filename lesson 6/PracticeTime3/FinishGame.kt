enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    private var path = mutableListOf(Direction.START)

   
    val north = {
        path.add(Direction.NORTH)
        true
    }

    val south = {
        path.add(Direction.SOUTH)
        true
    }

    val east = {
        path.add(Direction.EAST)
        true
    }

    val west = {
        path.add(Direction.WEST)
        true
    }

    val end = {
        path.add(Direction.END)
        println("Game Over")
        println("Path: $path")
        path.clear()
        false
    }

    
    fun move(where: () -> Boolean) {
        where()
    }

   
    fun makeMove(direction: String?) {
        when (direction?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}
