abstract class Mamifero(
    peso: Float,
    altura: Short
) : Animal(
    peso, altura
){
    abstract fun amamentar(): String
}