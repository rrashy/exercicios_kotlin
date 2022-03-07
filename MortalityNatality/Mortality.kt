fun main() {
 print("Digite o número de nascimentos: ")
 val nasc = readLine()!!.toFloat()
 print("Digite o número de habitantes: ")
 val hab = readLine()!!.toFloat()
 print("Digite o número de óbitos: ")
 val mort = readLine()!!.toFloat()

 println("#######################################")
 println("#############!!! MENU !!!##############")
 println("##    Digite N ou M para calcular    ##")
 println("##      1 - Taxa de natalidade       ##")
 println("##      2 - Taxa de mortalidade      ##")
 println("#######################################")
 print("Digite aqui qual sua opção: ")

when (readLine()!!.toInt()) {
  1 -> println("Opção escolhida: Taxa de mortalidade: ${(mort * 1000) / hab}" )
  2 -> println("Opção escolhida: Taxa de natalidade: ${(nasc * 1000) / hab}")

  else -> println("Opção Invalida!")
 }
}