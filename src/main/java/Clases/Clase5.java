package Clases;
import java.util.Scanner;

public class Clase5 {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definir un arreglo para almacenar las notas
            double[] notas = new double[4];

            // Solicitar al usuario que ingrese las notas
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }

            // Calcular el promedio de las notas
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i];
            }
            double promedio = suma / notas.length;

            // Mostrar el promedio de las notas
            System.out.println("El promedio de las notas es: " + promedio);

            scanner.close();
        }
    }