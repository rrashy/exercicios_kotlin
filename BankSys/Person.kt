import java.time.LocalDate

abstract class Person(

    var name: String,
    var cpf: String,
    var email: String,
    var telephone: String,
    var yearOfBirth: LocalDate,
    var rg: String
    )