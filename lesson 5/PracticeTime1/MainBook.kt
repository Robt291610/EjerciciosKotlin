fun main() {
    val book = Book("1984", "George Orwell", 1949)


    val (title, author) = book.getTitleAndAuthor()

    
    val (_, _, year) = book.getBookDetails()

    println("Here is your book \"$title\" written by $author in $year.")
}
