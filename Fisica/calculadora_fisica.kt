class calculadora_fisica {

    fun calcularForcaPeso(massa: Short, aceleracaoGravidade: Float): Float {
        return (massa * aceleracaoGravidade).toFloat()
    }

    fun calcularForcaCentripeta(massa: Short, velocidade: Short, raioCurva: Short): Float {
        return (massa * velocidade * velocidade / raioCurva).toFloat()
    }

    fun calcularImpulso(forca: Short, deltaT: Short): Float {
        return (forca * deltaT).toFloat()
    }

    fun calcularForcaElastica(constEC: Short, deformSPCE: Short): Float {
        return (constEC * deformSPCE).toFloat()
    }

    fun calcularVelocidadeMedia(deltaS: Short, deltaT: Short): Float {
        return (deltaS / deltaT).toFloat()
    }

    fun calcularMRU(posicaoInicial: Short, velocidadeConst: Short, instante: Short): Float {
        return (posicaoInicial + velocidadeConst * instante).toFloat()
    }

    fun calcularMRUV(deltaVelocidade: Short, deltaTempo: Short): Float {
        return (deltaVelocidade / deltaTempo).toFloat()
    }
}