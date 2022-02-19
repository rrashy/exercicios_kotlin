import java.math.BigDecimal

class SavingsAccount(
    agency: String,
    number: String,
    balance: BigDecimal,
    var remainingWithdrawals: String,
    var extract: String
) : Account(
    agency, number, balance
)

fun remaingWithdrawls(value: String) {
    print("You have * remaining")
}

fun extract(value: String) {
    print("Here your extract for this month:")
}