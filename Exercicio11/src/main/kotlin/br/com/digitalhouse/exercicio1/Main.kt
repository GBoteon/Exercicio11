package br.com.digitalhouse.exercicio1

fun main() {
    var lista = arrayListOf("Pato", "Cachorro", "Gato")
    try {
        println(lista.get(3))

    } catch (ex: IndexOutOfBoundsException){
        println(ex)
        ex.printStackTrace()
    }

    //muito bom o exercicio - ass: Thais
}

 // fazendo uma alteração para subir na minha branch do git

