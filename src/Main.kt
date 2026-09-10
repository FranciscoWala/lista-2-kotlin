import model.ContaBancaria
import model.Funcionario
import model.Gerente
import model.Pessoa
import model.Produto


fun main() {
    //Ex 12
//    batataQuente()

    //Ex13
//    numeroImpar()

    //Ex 14
//      totalCompras()

    //Ex15
//    mediaCompras()

    //Ex16
//    fatorial()

    //Ex 17
//    pessoal()

    //Ex 18
//    trabalharComProdutos()

    // Ex 19
//    contaBancaria()

    // Ex 20
//      Crie uma classe “Funcionário” com “nome”, “salario” e uma função que retorne o
//      salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a
//      função que retorna o salário, retornando o salário com 20% de comissão (aumento)

    var funcionario = Funcionario()
    funcionario.nomeFuncionario = "Francisco"
    funcionario.salario = 2000.0

    val gerente = Gerente()
    gerente.nomeFuncionario = "Joao"
    gerente.salario = 3000.0

    println("""
            funcionario: ${funcionario.nomeFuncionario}
            salario: ${funcionario.mostrarSalario()}
            
            gerente: ${gerente.nomeFuncionario}
            salario: ${gerente.mostrarSalario()}
    """.trimIndent())
}

fun batataQuente () {

//    var numeros = 1..100

    for (numero in 1..100 ) {

        if (numero % 5 == 0 && numero % 3 == 0){
            println("batataquente com numero $numero")
        } else if (numero % 3 == 0) {
                println("batata com numero $numero")
        } else if (numero % 5 == 0 ){
                println("quente com numero $numero")
        } else {
            println(numero)
        }

    }

}

fun numeroImpar (){

//    val numerosFrancisco = 1..100
//
//    println(numerosFrancisco.filter{it % 2 == 1})

    //Outra maneira

    val numerosHenry = listOf(1,2,3,4,5,6,7,8,9,10)
    val impares = numerosHenry.filter{it % 2 != 0}

    println(impares)
}

fun totalCompras () {

    val valoresCompras = (1..1000).toList()

    var soma = valoresCompras.reduce{ acumulador, numero -> acumulador + numero }

    println(soma)

}

fun mediaCompras(){
    val valoresCompras = (1..1000).toList()

//    val valoresCompras = arrayOf(1, 2, 3 , 4, 5)
//    valoresCompras.size
    val media = valoresCompras.reduce{ acumulador, numero -> acumulador + numero }/valoresCompras.size
    println("Média das compras: $media")

//    val idades = listOf(12,18,20,24)
//
//    val maioresIdade = idades.filter {it >=  18}
//
//    val media = maioresIdade.average()
//    println(media)

}

fun fatorial (){

    var numero = 5
    var totalFatorial = 1
    for (i in 1..numero ) {
        totalFatorial *= i
    }
        println(totalFatorial)
}

fun pessoal () {

//    val frase = Pessoa("Maria", 26, "São Paulo" )
    val pessoa = Pessoa("Francisco", 24, "Barueri")
    pessoa.apresentarse()
}

fun trabalharComProdutos () {

    var listaDeProdutos = arrayOf(
        Produto("Teclado", 100.00),
        Produto("Mouse", 1200.00),
        Produto("Monitor", 1_599_000.00),
        Produto("MacStudio", 200_000.00))

//    listaDeProdutos[0].produto = "Teclado"
//    listaDeProdutos[0].preco = 1000.00
//
//    listaDeProdutos[1].produto = "Computador"
//    listaDeProdutos[1].preco = 1500.00
//
//    listaDeProdutos[2].produto = "Mouse"
//    listaDeProdutos[2].preco = 10.00

    var itemMaisCaro = listaDeProdutos[0]

    for (produto in listaDeProdutos){

        if (produto.preco > itemMaisCaro.preco){

            itemMaisCaro = produto

        }
    }
    println(itemMaisCaro.produto)

}

fun contaBancaria () {

    var contaBancaria = ContaBancaria()

    contaBancaria.nomeTitular = "MARIA DA SILVA"

    contaBancaria.depositarValor(200.00)

    contaBancaria.sacarValor(50.00)

    val extrato = contaBancaria.consultarValor()

    println("Extrato de : \n" +
            "${contaBancaria.nomeTitular} é \n" +
            "R$$extrato reais")

}
