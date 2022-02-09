import kotlin.math.pow  //<--importando potencia
import kotlin.math.sqrt //<--importando raiz quadrada

class Calculadora {
    fun somar(num1: Float, num2: Float): Float {
        return num1 + num2
        //println("A soma entre $num1 e $num2 é: ")
    }

    fun subtrair(num1: Float, num2: Float): Float {
        return num1 - num2
        //println("A subtração entre $num1 e $num2 é: ")
    }

    fun dividir(dividendo: Float, divisor: Float): Float {
        return dividendo / divisor
        //println("A divisão entre $dividendo e $divisor é: ")
    }

    fun multiplicar(parcela1: Float, parcela2: Float): Float {
        return parcela1 * parcela2
        //println("A multiplicação entre $parcela1 e $parcela2 é: ")
    }

    fun potencia(base: Double, expoente: Double): Float {
        return base.pow(expoente).toFloat() //converte Double em Float
        //println("A potencia de $base e $expoente é: ")
    }

    fun modulo(num1: Float, num2: Float) = num1 % num2

    fun raizQuadrada(num: Float) = sqrt(num)

}
