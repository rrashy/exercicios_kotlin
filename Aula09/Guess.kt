import kotlin.random.Random

class Guess {
    private var numDrawn:Int? = null
    private fun draw() = Random.nextInt(0, 10)

    fun play(guessing:Int): String {
        numDrawn = draw()
        if (guessing == numDrawn){
            return "You win the guess!!!"
        }
        return "Sorry!, you lose. Correct number is $numDrawn!"
    }
}