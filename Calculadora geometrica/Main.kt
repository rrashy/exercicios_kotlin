fun main(args: Array<String>) {
//    val calculadora: Calculadora = Calculadora()
//
//    val resultadoSoma: Float = calculadora.somar(54f, 82f)
//    println("O resultado da soma é $resultadoSoma")
//
//    val raiz = calculadora.raizQuadrada(81f)
//    println("A raiz quadrada de 81 é $raiz")

    val geometria:Geometria = Geometria()

    println("Area do circulo calculando a aréa do circulo")
    println("Digite o raio: ")
    var raio = readLine()!!.toDouble()
    var area = geometria.calcularAreaDoCirculo(raio)
    println("A area do circulo é: $area")
}