class Aluno(
    private var nome: String,
    private var nota1: Float,
    private var nota2: Float
) {
    fun verificarSituacao(): String {
        val media = (nota1 + nota2) / 2

        if (media >= 9)
            return "$nome foi aprovado com distinção"
        else if (media >= 6)
            return "$nome foi aprovado"
        else if (media >=4)
            return "$nome está de recuperação"
        return "$nome foi reprovado"
    }
}