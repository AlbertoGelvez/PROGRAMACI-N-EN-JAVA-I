package Trabajos;

public class Trabajo4 {
    public class ConversorDeTemperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la temperatura: ");
            double temperatura = scanner.nextDouble();

            scanner.nextLine();


            System.out.print("Ingrese la unidad (C para Celsius, F para Fahrenheit): ");
            char unidad = scanner.nextLine().toUpperCase().charAt(0);

            if (unidad == 'C') {
                double fahrenheit = (temperatura * 9/5) + 32;
                System.out.println(temperatura + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
            } else if (unidad == 'F') {
                double celsius = (temperatura - 32) * 5/9;
                System.out.println(temperatura + " grados Fahrenheit son " + celsius + " grados Celsius.");
            } else {
                System.out.println("Unidad no reconocida. Por favor, ingrese C para Celsius o F para Fahrenheit.");
            }

            scanner.close();
        }
    }

}

