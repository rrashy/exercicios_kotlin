fun main() {
    activity1()
    //activity2()
    //activity3()
    //activity4()
    //activity5()
    //activity6()
    //activity7()
}

//--> Escola avaliação
fun activity1():Unit{
    val gabriel = Aluno("Gabriel",9f,9f)
    println(gabriel.verificarSituacao())
    val joao = Aluno("Joao",8f,9f)
    println(joao.verificarSituacao())
    val matheus = Aluno("Matheus",4f,3f)
    println(matheus.verificarSituacao())
    val helena = Aluno("Helena",4f,4f)
    print(helena.verificarSituacao())
}

//--> Genero
fun activity2():Unit{
    println("Digite o gênero com qual você se identifica: \nM - Masculino\nF - Feminino\nO - Outro")
    val genero = readLine()!!

    if (genero.equals("m",true))
        println("Seja bem-vindo senhor!")
    else if (genero.equals("f",true))
        println("Seja bem-vinda senhora!")
    else if (genero.equals("o",true))
        println("Seja bem-vindo!")
    else
        println("Sexo inválido!!")
}

// --> Turnos
fun activity3():Unit{
    println("Qual turno você estuda: \nM - Matutino\nV - Vespertino\nN - Noturno")
    val turno = readLine()!!

    if (turno.equals("m",true))
        println("Olá bom dia!")
    else if (turno.equals("V",true))
        println("Olá boa tarde!")
    else if (turno.equals("n",true))
        println("Olá boa noite!")
    else
        println("Olá! por favor informe um turno válido!!")
}

//--> Maior ou menor
fun activity4():Unit{
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toFloat()
    print("Digite o segundo número: ")
    val num2  = readLine()!!.toFloat()
    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toFloat()

    if (num1 > num2 && num1 > num3)
        println("O primeiro número é o maior deles!")
    else if (num2 > num1 && num2 > num3)
        println("O segundo número é o maior deles!")
    else if (num3 > num1 && num3 > num2)
        println("O terceiro é o maior número deles!")
    else
        println("Digite números diferentes!")
}

//--> Calculadora com When/If
fun activity5():Unit{
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toFloat()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toFloat()
    println("Escolha a operação:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir")

    when (readLine()!!.toInt()){
        1 -> print("A soma é ${num1 + num2}")
        2 -> print("A subtração é ${num1 - num2}")
        3 -> print("A multiplicação é ${num1 * num2}")
        4 -> print("A divisão é ${num1 / num2}")
        else -> print("Operação invalida!!")
    }

}

//--> Desconto em loja
fun activity6():Unit{
    print("Digite o total da venda: ")
    val totalDaVenda = readLine()!!.toFloat()
    println("Escolha o tipo de cliente\n1 - Funcionário\n2 - VIP\n3 - Comum")

    when (readLine()!!.toInt()){
        1 -> println("Total a pagar: ${totalDaVenda - totalDaVenda * 0.1}")
        2 -> println("Total a pagar: ${totalDaVenda - totalDaVenda * 0.05}")
        else -> print("Total a pagar: $totalDaVenda")
    }

}

//--> Meses
fun activity7():Unit{
    print("Digite um número correspondente ao mês: ")
    when (readLine()!!.toInt()){
        1 -> print("Janeiro")
        2 -> print("Fevereiro")
        3 -> print("Março")
        4 -> print("Abril")
        5 -> print("Maio")
        6 -> print("Junho")
        7 -> print("Julho")
        8 -> print("Agosto")
        9 -> print("Setembro")
        10 -> print("Outubro")
        11 -> print("Novembro")
        12 -> print("Dezembro")
        else -> print("Este mês não existe")
    }
}