//--> App Filme
import java.util.Date

fun main(){

//Objetos
    var titanic:Filme = Filme()

    titanic.titulo = "Titanic"
    titanic.classificacao = "Não é recomendado para menor de 12 anos"
    println(titanic.titulo)
    println(titanic.classificacao)
}


//Classe
class Filme{
    var titulo:String? = null
    var genero:String? = null
    var duracao:Int? = null
    var classificacao:String? = null
    var eUmaPreEstreia:Boolean? = null
    var anoDeLancamento:Date? = null
    var diretor:String? = null
    var roterista:String? = null
    var elenco:Elenco? = null
}
class Elenco{
    var nome:String? = null
    var idade:Byte? = null
}