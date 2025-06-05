import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        val pagesToTear = Random.nextInt(1, 10)
        println("Puppy tears $pagesToTear pages!")
        book.tornPages(pagesToTear)
    }
}