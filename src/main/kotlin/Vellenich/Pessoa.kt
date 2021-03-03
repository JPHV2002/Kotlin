package Vellenich

class Pessoa {

    var nome = "João"
    var idade = 18

    inner class Endereco{
        var rua = "rua"
        var numero = 412
    }

}

fun main(){
    val joao = Pessoa()

    println(joao.Endereco().numero)
}