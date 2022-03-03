fun main() {
    val priceA = 3.90
    val priceG = 5.20

    print("Enter how many liters you want to fill: ")
    val liters = readLine()!!.toFloat()

    println("Enter a type combustible:\nA - Alcohol\nG - Gasoline")
    val combustible = readLine()!!

    if (combustible.equals("A", true)) println("Você escolheu -> A <-.. abastecer alcool!")
    else if (liters <= 20) {
        return println("Total a pagar (3% desconto): " + liters * (priceA * (1 - (3 / 100))))
    } else if (liters >= 20) {
        return println("Total a pagar (5% desconto): " + liters * (priceA * (1 - (5 / 100))))
    }
    if (combustible.equals("G", true)) println("Você escolheu -> G <-.. abastecer gasolina!")
    else if (liters <= 20) {
        return println("Total a pagar (4% desconto): " + liters * (priceG * (1 - (4 / 100))))
    } else if (liters >= 20)
        return println("Total a pagar (6% desconto): " + liters * (priceG * (1 - (6 / 100))))
}