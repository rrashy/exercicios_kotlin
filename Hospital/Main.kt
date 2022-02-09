fun main() {
    //val endereco1 = Endereco()
    val fraga = Paciente()
    val internacao = Internacao()

    //println(endereco1.logradouro)
    //fraga.endereco?.cidade = "Porto Alegre" <-- não funciona
    //fraga.endereco = Endereco()
    //fraga.endereco!!.cidade = "Porto Alegre"
    //println(fraga.endereco?.cidade)


    internacao.paciente = Paciente()
    internacao.paciente!!.nomeCompleto = "Gabriel Fraga"
    internacao.paciente!!.cpf = "000.000.000-00"
    internacao.paciente!!.endereco = Endereco()
    internacao.paciente!!.endereco!!.cidade = "Porto Alegre"
    internacao.paciente!!.endereco!!.estado = "Rio Grande do Sul"

    println(internacao.paciente!!.nomeCompleto)
    println(internacao.paciente!!.cpf)
    println(internacao.paciente!!.endereco!!.cidade)
    println(internacao.paciente!!.endereco!!.estado)
}