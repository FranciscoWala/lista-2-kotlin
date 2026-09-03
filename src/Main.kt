//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*
    Exercício 12
    Escreva um programa que conte de 1 a 100 e:
        ● Se for múltiplo de 3, mostre “Batata”
        ● Se for múltiplo de 5, mostre “Quente”
        ● Se for múltiplo de 3 e 5, mostre “BatataQuente”
    */


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

//    Ex 17

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