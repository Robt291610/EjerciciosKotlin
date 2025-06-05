fun main() {
    
    val todoList: MutableList<String?> = mutableListOf()

    
    todoList.add("Buy groceries")
    todoList.add(null)
    todoList.add("Call the bank")
    todoList.add("Finish Kotlin assignment")

    
    println("To-do List:")
    for (task in todoList) {
        println(task ?: "[No task description]")
    }

    
    println("\nGetting the first task...")
    val firstTask = todoList.firstOrNull()

    if (todoList.isEmpty()) {
        println("No tasks in the list.")
    } else {
        println("First task: ${firstTask ?: "[No task description]"}")
    }
}
