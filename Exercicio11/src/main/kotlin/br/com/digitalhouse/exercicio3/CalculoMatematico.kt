package br.com.digitalhouse.exercicio3

class CalculoMatematico() {
    fun dividir(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            throw ArithmeticException("Impossivel dividir por 0")
            return 0
        }
        return num1 / num2
    }
}
//        try {
//            return num1/num2
//        } catch (ex: ArithmeticException) {
//            println(ex)
//            println("Essa operação não pode ser realizada")
//            ex.printStackTrace()
//            return 0
//        }

