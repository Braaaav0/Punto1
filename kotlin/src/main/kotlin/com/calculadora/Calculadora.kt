package com.calculadora

class Calculadora {

    fun sumar(a: Double, b: Double): Double = a + b

    fun restar(a: Double, b: Double): Double = a - b

    fun multiplicar(a: Double, b: Double): Double = a * b

    fun dividir(a: Double, b: Double): Double {
        if (b == 0.0) {
            println("Error: No se puede dividir entre cero.")
            return Double.NaN
        }
        return a / b
    }
}

fun main() {
    val calc = Calculadora()
    val scanner = java.util.Scanner(System.`in`)

    println("=== CALCULADORA BÁSICA ===")
    println("1. Sumar")
    println("2. Restar")
    println("3. Multiplicar")
    println("4. Dividir")
    print("Selecciona una opción (1-4): ")
    val opcion = scanner.nextInt()

    print("Ingresa el primer número: ")
    val num1 = scanner.nextDouble()

    print("Ingresa el segundo número: ")
    val num2 = scanner.nextDouble()

    var operacionValida = true
    val resultado: Double = when (opcion) {
        1 -> calc.sumar(num1, num2)
        2 -> calc.restar(num1, num2)
        3 -> calc.multiplicar(num1, num2)
        4 -> calc.dividir(num1, num2).also { if (it.isNaN()) operacionValida = false }
        else -> { println("Opción no válida."); operacionValida = false; 0.0 }
    }

    if (operacionValida) {
        println("El resultado es: $resultado")
    }

    scanner.close()
}
