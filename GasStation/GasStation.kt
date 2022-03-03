fun main() {
    val priceA = 3.90
    val priceG = 5.20

    print("Enter how many liters you want to fill: ")
    val liters = readLine()!!.toFloat()

    println("Enter a type combustible:\nA - Alcohol\nG - Gasoline")
    val combustible = readLine()!!

    if (combustible.equals("A", true)) println("You chose -> A <- supply alcohol!")
    else if (liters <= 20) {
        return println("Total payable (3% discount): " + liters * (priceA * (1 - (3 / 100))))
    } else if (liters >= 20) {
        return println("Total payable (5% discount): " + liters * (priceA * (1 - (5 / 100))))
    }
    if (combustible.equals("G", true)) println("You chose -> G <- supply gasoline!")
    else if (liters <= 20) {
        return println("Total payable (4% discount): " + liters * (priceG * (1 - (4 / 100))))
    } else if (liters >= 20)
        return println("Total payable (6% discount): " + liters * (priceG * (1 - (6 / 100))))
}