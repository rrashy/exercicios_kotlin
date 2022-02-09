import java.time.LocalDateTime
class Internacao {

// doctor
    var medicoResponsavel: String? = null
        get() = if (field == null) Medico().toString() else field
        set(value) {
            if (value != null)
                field = value
        }

// patient
    var paciente: Paciente? = null
        get() = if (field == null) Paciente() else field
        set(value) {
            if (value != null)
                field = value
        }

// date internation
    var dataInternacao: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }

// discharge
    var dataAlta: LocalDateTime? = null
        set(value) {
            if (value == null){
                field == LocalDateTime.now()
            }else{
                field = value
            }
        }

// obs
    var observacoes: String? = null
        get() = if (field.isNullOrEmpty()) "Não observações registradas" else field
    set(value) {
        if (value.isNullOrEmpty()) null else value
    }
}