

class Book(val title: String, val author: String) {

    const val MAX_BOOKS = 5

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BOOKS
    }

    fun printUrl() {
        println("${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        private const val BASE_URL = "https://library.books.com/catalog/"
    }
}



