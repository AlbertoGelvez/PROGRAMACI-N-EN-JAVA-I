package Trabajos;

import java.util.Scanner;

public class Trabajo3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese los tres números
            System.out.println("Ingrese el primer número:");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número:");
            int num2 = scanner.nextInt();

            System.out.println("Ingrese el tercer número:");
            int num3 = scanner.nextInt();

            // Determinar el mayor de los tres números
            int mayor = num1;

            if (num2 > mayor) {
                mayor = num2;
            }

            if (num3 > mayor) {
                mayor = num3;
            }

            // Mostrar el resultado
            System.out.println("El mayor de los tres números es: " + mayor);

            scanner.close();
        }


}
