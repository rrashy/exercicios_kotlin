import java.math.BigDecimal

class CheckingAccount(
    agency: String,
    number: String,
    balance: BigDecimal,
    var transfer: String,
    var billPayment: String
) : Account(
    agency, number, balance
)

fun transfer(value: String) {
    println("Was transfer")
}

fun billPayment(value: String) {
    println("Your account has been paid!")
}