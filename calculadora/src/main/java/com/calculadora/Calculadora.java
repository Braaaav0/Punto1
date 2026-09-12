package com.calculadora;

import java.util.Scanner;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Selecciona una opción (1-4): ");
        int opcion = scanner.nextInt();

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1: resultado = calc.sumar(num1, num2); break;
            case 2: resultado = calc.restar(num1, num2); break;
            case 3: resultado = calc.multiplicar(num1, num2); break;
            case 4:
                resultado = calc.dividir(num1, num2);
                if (Double.isNaN(resultado)) operacionValida = false;
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
