

class Book(val title: String, val author: String, var pages: Int) {

    const val MAX_BOOKS = 5

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BOOKS
    }

    fun Book.weight(): Double {
    return this.pages * 1.5
    }

    fun Book.tornPages(pagesTorn: Int) {
    pages = (pages - pagesTorn).coerceAtLeast(0)
    }

    fun printUrl() {
        println("${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        private const val BASE_URL = "https://library.books.com/catalog/"
    }
}


