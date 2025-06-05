fun main()
{
    val trout: String = "trout"
    val haddock: String = "haddock"
    val snapper: String = "snapper"

    val likesTrout = true
    val likesHaddock = false
    val likesSnapper = true

    println("I ${if(likesTrout) "do" else "don't"} like trout")
    println("I ${if(likesHaddock) "do" else "don't"} like haddock")
    println("I ${if(likesSnapper) "do" else "don't"} like Snapper")
}