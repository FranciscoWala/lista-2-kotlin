import model.ContaBancaria
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

    // Ex 18
//    contaBancaria()

}

fun batataQuente () {

//    var numeros = 1..100

    for (numero in 1..100 ) {

        if (numero % 5 == 0 && numero % 3 == 0){
            println("batataquente com numero $numero")
        } else {
            if (numero % 3 == 0) {
                println("batata com numero $numero")
            }
            if (numero % 5 == 0 ){
                println("quente com numero $numero")
            }
        }
    }

}

fun numeroImpar (){

    val numeros = 1..100

    println(numeros.filter{it % 2 == 1})

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

    println("O extrato de : \n" +
            "${contaBancaria.nomeTitular} é \n" +
            "R$$extrato reais")

}