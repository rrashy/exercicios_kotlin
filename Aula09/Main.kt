fun main() {
    activity5()
}

// --> 1
fun activity1(): Unit {
    print("Enter the first number: ")
    val number1 = readLine()!!.toInt()
    print("Enter the second number: ")
    val number2 = readLine()!!.toInt()

    if (number1 > number2) {
        println("The first number ($number1) is bigger than second number ($number2).")
    } else {
        println("The first number ($number1) IS NOT bigger than second number ($number2).")
    }
}

// --> 2
fun activity2(): Unit {
    print("Enter a number: ")
    val number = readLine()!!.toInt()
    if (number > 0) {
        println("This number ($number) is positive!")
    } else {
        println("This number ($number) is negative!")
    }
}

// --> 3
fun activity3(): Unit {
    print("Enter a letter: ")
    val letter = readLine()!!.toString()
    if (letter.equals("a", true) ||
        letter.equals("e", true) ||
        letter.equals("i", true) ||
        letter.equals("o", true) ||
        letter.equals("u", true)
    ) {
        println("This letter (${letter.toUpperCase()}) is vowel.")
    } else {
        println("This letter (${letter.toUpperCase()}) is consonants.")
    }
}

// --> 4
fun activity4():Unit{
    val guess = Guess()
    print("Enter a number 0-10 to your guess: ")
    val drawGuess = readLine()!!.toInt()

    if (drawGuess >=0 && drawGuess <=10){
        print(guess.play(drawGuess))
    }else{
        println("This number is NOT valid")
    }
}


//--> 5
fun activity5(): Unit{
    val jogo = Jokenpo()
    println("Escolha uma opção\n1 - Pedra\n2 - Papel\n3 - Tesoura")
    val jogadaUsuario = readLine()!!.toInt()

    if (jogadaUsuario in 1..3){
        print(jogo.jogar(jogadaUsuario))
    }else{
        print("Jogada invalida")
    }
}
