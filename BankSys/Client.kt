import java.time.LocalDate

class Client(
    name: String,
    cpf: String,
    email: String,
    telephone: String,
    yearOfBirth: LocalDate,
    rg: String,
    var identifier: String,
    var typeAccount: String,
    var password: String,
    var register: Boolean
) : Person(
    name, cpf, email, telephone, yearOfBirth, rg
)


