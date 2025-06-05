fun main() {
    val book = Book("The Tempest", "William Shakespeare")

    println("Can borrow more? ${book.canBorrow(3)}") // true
    println("Can borrow more? ${book.canBorrow(5)}") // false

    book.printUrl() 
}