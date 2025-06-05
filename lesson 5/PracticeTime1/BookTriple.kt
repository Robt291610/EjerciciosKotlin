class Book(val title: String, val author: String, val year: Int) {

    
    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    
    fun getBookDetails(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
