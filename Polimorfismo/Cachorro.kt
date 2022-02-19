class Cachorro(
    peso: Float,
    altura: Short
) : Mamifero(
    peso, altura
) {
    override fun comer(): String = "Comendo ração para cachorros"
    override fun emitirSom(): String = "Latindo como um cachorro"
    override fun amamentar(): String = "Amamentando com leite de cachorro"
    }
