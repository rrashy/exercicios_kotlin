fun main() {

    println("Enter the value of the product: ")
    val valuePayment = readLine()!!.toFloat()

    println("Choose an option: \n1 - Cash\n2 - Term\n3 - Term in installments")

    when (readLine()!!.toDouble()) {
        1.0 -> println("Option chosen: Cash \nTotal Amount: ${valuePayment - (valuePayment * 15 / 100)}" )

        2.0 -> println("Option chosen: Term (30 days) \\nTotal Amount: ${valuePayment + (valuePayment * 3 / 100)}")

        3.0 -> println("Option chosen: In installments \\nTotal Amount: ${valuePayment + (valuePayment * 1.5 / 100)}")

        else -> println("Invalid option!")}
}