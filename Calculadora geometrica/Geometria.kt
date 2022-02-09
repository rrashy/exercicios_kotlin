import kotlin.math.PI
import kotlin.math.pow

class Geometria {

    fun calcularAreaDoCirculo(raio: Double): Float = (PI * raio.pow(2)).toFloat()
    fun calcularAreaDoTriangulo(base: Byte, altura: Byte): Int = base * altura / 2
    fun calcularPerimetroCirculo(raio: Double): Float = (2 * PI * raio).toFloat()
}