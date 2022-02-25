import kotlin.random.Random

class Jokenpo {
    private var jogadaPC: Int? = null

    /*
        1 - pedra
        2 - papel
        3 - tesoura
     */
    fun jogar(JogadaUsuario: Int): String {
        jogadaPC = Random.nextInt(1, 3)

        if (JogadaUsuario == 1 && jogadaPC == 3 ||
            JogadaUsuario == 2 && jogadaPC == 1 ||
            JogadaUsuario == 3 && jogadaPC == 2
        ){
            return "Você ganhou!"
        }else{
            return "Computador ganhou!"
        }
    }
}