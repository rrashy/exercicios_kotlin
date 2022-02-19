import java.time.LocalDate
import java.util.Date

class Manager(
    name: String,
    cpf: String,
    email: String,
    telephone: String,
    yearOfBirth: LocalDate,
    rg: String,
    var wage: String,
    var workload: String,
    var employeeIdentifier: String,
    var payday:Date
) : Person(
    name, cpf, email, telephone, yearOfBirth, rg
)
