package br.com.digitalhouse.exercicio3

fun main() {
    val calculadora = CalculoMatematico()
    try {
        calculadora.dividir(4,0)
    } catch (ex: ArithmeticException){
        ex.printStackTrace()
    }
}