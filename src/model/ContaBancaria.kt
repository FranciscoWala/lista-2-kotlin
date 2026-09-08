package model

open class ContaBancaria {

//  Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo”
//  (privado) e crie funções para depositar um valor, sacar um valor e para consultar o
//  saldo()

    var nomeTitular: String = ""
    private var saldo: Double = 0.0

    open fun depositarValor (deposito: Double) {
        saldo += deposito
    }

    fun sacarValor (valorRetirado : Double) {

        saldo -= valorRetirado

    }

    fun consultarValor () : Double{

        return saldo

    }


}