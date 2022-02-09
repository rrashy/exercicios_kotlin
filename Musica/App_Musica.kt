// --> app musica 
import java.util.Date;

fun main(){
    //objetos
    var candleEnt:Gravadora = Gravadora()

    candleEnt.nomeGravadora = "Candle Entertainment"
    candleEnt.endereco = "Rua Gabal Amstel nº4765"

    println(candleEnt.nomeGravadora)
    println(candleEnt.endereco)

}
//Classes
class Musica{
    var titulo:String? = null
    var duracao:Int? = null
    var generoMusical:String? = null
    var anoDeLancamento:Date? = null
    var Compositor:Compositor? = null
    var Gravadora:Gravadora? = null
}
class Compositor{
    var nome:String? = null
    var idade:Byte? = null
    var cpf:String? = null
    var telefoneComercial:String? = null
}
class Gravadora{
    lateinit var nomeGravadora:String // -- > exemplificando o inicializar em 'algum momento'
    var cnpj:String? = null
    var endereco:String? = null
    var telefoneComercialGravadora:String? = null
}
/*
class Endereco{
    var cep:String? = null
    var numeroResidencia:Int? = null
    var nomeRua:String? = null
    var referencia:String? = null
    // var referencia:Sting = "" --> String vazia
    // lateinit var referencia:String --> 'resolvo mais tarde estou ciente' --> se esquecer dar valor VAI DAR ERRO
}*/
