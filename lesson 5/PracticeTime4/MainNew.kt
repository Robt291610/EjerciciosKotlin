fun main() {
    val book = Book("War and Peace", "Leo Tolstoy", 100)
    val puppy = Puppy()

    while (book.pages > 0) {
        println("Book has ${book.pages} pages and weighs ${book.weight()} grams")
        puppy.playWithBook(book)
    }

    println("All pages are gone! Final book weight: ${book.weight()} grams.")
}
