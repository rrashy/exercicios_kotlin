class Medico {
    var crm: String? = null
        get() = if (field.isNullOrEmpty()) "CRM do médico não informado" else field
        set(value) {
            field = if (value!!.length == 9) value else null
        }
    var nomeCompleto: String? = null
        get() = if (field.isNullOrEmpty()) "Nome completo do medico não informado" else field
        set(value) {
            field = if (value!!.length < 2 ) value else null
        }
    var endereco: Endereco? = null
        get() = if (field == null) Endereco() else field
        set(value) {
            if (value != null){
                field = value
            }
        }
    var telefoneParaContato: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone para contato do medio não informado" else field
        set(value) {
            field = if (value!!.length >= 11) value else null
        }
}