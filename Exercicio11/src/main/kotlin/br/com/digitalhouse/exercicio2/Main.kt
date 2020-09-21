package br.com.digitalhouse.exercicio2

fun main() {
    var lista = arrayListOf<String>()
    try {
        println(lista.get(5))
    } catch (ex: NullPointerException){
        println(ex)
        ex.printStackTrace()
    } catch (ex: IndexOutOfBoundsException){
        println(ex)
        ex.printStackTrace()
    }
}
