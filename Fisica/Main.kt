fun main() {

    val calculadoraFisica: calculadora_fisica = calculadora_fisica()

    //--> Calculo força elastica

    val forcaElastica: Float = calculadoraFisica.calcularForcaElastica(10, 110)

    println("Uma mola está previamente fixada em um suporte. Ao aplicarmos uma força em sua outra extremidade, ela sofre uma deformação de 10 metros. Sabendo que a sua constante elástica é de 110 N/m, determine a intensidade da força aplicada.")
    println("Nesse caso, o enunciado nos dá dois valores importantes: nós sabemos que a deformação é de 10 metros, ou seja, x = 10 m, assim como já sabemos que k = 110 N/m.")
    println("x = 10m")
    println("k = 110")
    println("Resultao: F = $forcaElastica")
    println("")

    //--> Calculo força peso

    val forcaPeso: Float = calculadoraFisica.calcularForcaPeso(30, 3.724f)

    println("Qual o peso de um corpo de massa 30 kg na superfície de Marte, onde a gravidade é igual a 3,724m/s²?")
    println("P = $forcaPeso N")
}
//
