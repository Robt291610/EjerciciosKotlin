fun main(args: Array<String>){
    if (args.isEmpty())
    {
        println("Please provide the hour(0 to 23) as a command-line argument")
        return
    }
    
    val hour = args[0].toIntOrNull()
    
    if(hour == null || hour !in 0..23){
        println("Invalid input. Please enter a number between 0 and 23")
    }
    else{
        if(hour < 12){
            println("Good morning,Kotlin")
        }
        else{
            println("Good night, Kotlin")
        }
    }
    
}