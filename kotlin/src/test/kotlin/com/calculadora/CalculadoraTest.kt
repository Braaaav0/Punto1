package com.calculadora

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class CalculadoraTest {

    private lateinit var calc: Calculadora

    @BeforeEach
    fun setUp() {
        calc = Calculadora()
    }

    @Test
    @DisplayName("Prueba de Suma básica")
    fun testSumar() {
        assertEquals(10.0, calc.sumar(7.0, 3.0), "La suma de 7 + 3 debería ser 10")
    }

    @Test
    @DisplayName("Prueba de Resta básica")
    fun testRestar() {
        assertEquals(5.0, calc.restar(12.0, 7.0), "La resta de 12 - 7 debería ser 5")
    }

    @Test
    @DisplayName("Prueba de Multiplicación básica")
    fun testMultiplicar() {
        assertEquals(18.0, calc.multiplicar(6.0, 3.0), "La multiplicación de 6 * 3 debería ser 18")
    }

    @Test
    @DisplayName("Prueba de División exacta")
    fun testDividir() {
        assertEquals(4.0, calc.dividir(20.0, 5.0), "La división de 20 / 5 debería ser 4")
    }

    @Test
    @DisplayName("Prueba de División por cero controlada")
    fun testDividirPorCero() {
        val resultado = calc.dividir(10.0, 0.0)
        assertTrue(resultado.isNaN(), "La división por cero debe retornar Double.NaN")
    }
}
