fun main(){
    val calcular: calcular = calcular()

    val faturamento: Float = calcular.faturamento(130f,240f,130f)
    println("Faturamento da compra foi de: R$$faturamento")
    val precoDeVenda: Float = calcular.precoDeVenda(500f,13f)
    println("Preço da venda foi de: R$$precoDeVenda")
}