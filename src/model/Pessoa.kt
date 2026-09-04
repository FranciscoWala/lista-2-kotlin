package model

class Pessoa (val nome : String,
              val idade : Int,
              val cidade: String) {

//        init {
//            println ("$nome tem $idade anos e mora em $cidade")
//        }

    fun apresentarse () {
        println("$nome tem $idade anos e mora em $cidade")
    }

}