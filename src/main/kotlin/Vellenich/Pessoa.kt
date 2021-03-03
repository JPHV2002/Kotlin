package Vellenich

class Pessoa {

    var nome = "João"
        private set

    var idade = 18
        private set

    inner class Endereco{
        var rua = "rua"
        var numero = 412
    }

}

fun main(){
    val joao = Pessoa()

    println(joao.nome)

    println(joao.idade)
    println(joao.nome)
    println(joao.Endereco().numero)
}