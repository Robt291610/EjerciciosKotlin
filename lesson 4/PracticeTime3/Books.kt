open class Book(val title: String, val author: String) {

    
    private var currentPage = 0

    open fun readPage() {
        currentPage++
        println("You read a page of '$title'. Total pages read: $currentPage")
    }
}


class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
        println("You read a page of '$title'. Total words read: $wordCount")
    }
}

fun main() {
    val paperBook = Book("Moby Dick", "Herman Melville")
    val digitalBook = eBook("Digital Fortress", "Dan Brown")

    
    paperBook.readPage()
    paperBook.readPage()

    digitalBook.readPage()
    digitalBook.readPage()
}
