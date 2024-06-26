package Clases;

import java.util.Scanner;

    public class Calculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double num1, num2;
            char operacion;

            System.out.println("Calculadora Básica");
            System.out.println("Seleccione una operación: + (suma), - (resta), * (multiplicación), / (división)");
            operacion = scanner.next().charAt(0);

            System.out.println("Ingrese el primer número:");
            num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número:");
            num2 = scanner.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case '+':
                    resultado = sumar(num1, num2);
                    break;
                case '-':
                    resultado = restar(num1, num2);
                    break;
                case '*':
                    resultado = multiplicar(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                    } else {
                        System.out.println("Error: División por cero no es permitida.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, seleccione una operación: +, -, *, /");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            scanner.close();
        }

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static double restar(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            return a / b;
        }
    }

