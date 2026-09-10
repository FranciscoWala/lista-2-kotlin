package model

open class Funcionario {

    var nomeFuncionario: String = ""
    var salario: Double = 0.0

    open fun mostrarSalario() : Double {
        return salario
    }

}