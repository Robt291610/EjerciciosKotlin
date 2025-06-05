fun main() {
   
    val itemNames = arrayOf("Laptop", "Mouse", "Keyboard", "Monitor")

   
    val itemPrices = arrayOf<Double?>(999.99, 25.50, null, 199.99)

   
    val index = 2 

    
    if (index in itemNames.indices && index in itemPrices.indices) {
        val name = itemNames[index]
        val price = itemPrices[index]

        if (price != null) {
            println("Item: $name, Price: $$price")
        } else {
            println("Item: $name, Price: Not available")
        }
    } else {
        println("Invalid item index.")
    }
}
