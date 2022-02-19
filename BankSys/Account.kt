import java.math.BigDecimal

abstract class Account(
    var agency: String,
    var number: String,
    var balance: BigDecimal
)

fun deposit(value: BigDecimal) {
    print("Was deposited")
}

fun withdraw(value: BigDecimal) {
    print("Was withdraw")
}