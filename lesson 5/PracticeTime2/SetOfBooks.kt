fun main() {

    val allBooks = setOf("Hamlet", "Macbeth", "Othello", "King Lear")


    val library = mapOf("William Shakespeare" to allBooks)


    val hasHamlet = library.any { (_, books) -> "Hamlet" in books }
    println("Library contains Hamlet: $hasHamlet")

   
    val moreBooks = mutableMapOf("Jane Eyre" to "Charlotte Brontë")

   
    val author = moreBooks.getOrPut("Wuthering Heights") { "Emily Brontë" }
    println("Author of Wuthering Heights: $author")

   
    println("More Books: $moreBooks")
}
