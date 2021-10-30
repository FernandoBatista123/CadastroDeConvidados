fun main(args: Array<String>) {

    var opcao = 0
    println("Qual opção você deseja? \n" +
            "\n1 - Adicionar um novo convidado" +
            "\n2 - Remover um convidado" +
            "\n3 - Listar os convidados")
    opcao = readLine()!!.toInt()

    val pessoas = mutableListOf("Ricardo", "Ana", "Fred")

    while (opcao == 1) {
        println("Digite o nome da pessoa que deseja adicionar: ")
        var nome = readLine()!!
        pessoas.add(nome)
        println(
            "Você adicionou $nome na lista\n" +
                    "Essa é sua lista agora: $pessoas\n")
        break
        }
    while (opcao == 2) {
        println("Digite o nome da pessoa que deseja remover: ")
        var nome = readLine()!!
        if (pessoas.contains(nome)){
            pessoas.remove(nome)
            println("Você removeu $nome na lista\n" +
                    "Essa é sua lista agora: $pessoas\n")
        }else{
            println("Não tem na lista.")
            break
        }
        }
        while (opcao == 3) {
            println(pessoas)
            break
        }
    println("Programa finalizado.")
}
