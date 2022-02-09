class Paciente {
    var nomeCompleto: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do paciente não informado" else field
        set(value) {
            field = if (value!!.length < 2) null else value
        }
    var rg: String? = null
        get() = if (field.isNullOrEmpty()) "RG do paciente não informado" else field
        set(value) {
            field = if (value!!.length == 10) value else null
        }
    var cpf: String? = null
        get() = if (field.isNullOrEmpty()) "CPF do paciente não informado" else field
        set(value) {
            field = if (value!!.length == 14) value else null
        }
    var telefoneParaContato: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone para contado não foi informado" else field
        set(value) {
            field = if (value!!.length >= 11) field else null
        }
    var endereco: Endereco? = null
        get() = if (field == null) Endereco() else field
        set(value) {
            if (value != null)
                field = value
        }
}