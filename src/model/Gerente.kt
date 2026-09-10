package model

class Gerente: Funcionario() {

    override fun mostrarSalario(): Double {
        return salario * 1.2
    }

}