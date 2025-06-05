fun List<Int>.filterIf(predicate: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}
