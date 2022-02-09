class calcular {
    fun totalCompra(custoUnitario: Float, quantidade: Float): Float {
        return custoUnitario * quantidade
    }

    fun faturamento(custosFixos: Float, totalDaCompra: Float, lucroLiquido: Float): Float {
        return custosFixos + totalDaCompra + lucroLiquido
    }

    fun precoDeVenda(faturamento: Float, quantidadeAdquirida: Float): Float {
        return faturamento / quantidadeAdquirida
    }
}