import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Simple");
        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");

        while (true) {
            System.out.print("Seleccione una opción (0-4): ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Hasta luego");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0.0;

            switch (opcion) {
                case 1:
                    resultado = calculadora.sumar(num1, num2);
                    break;

                case 2:
                    resultado = calculadora.restar(num1, num2);
                    break;

                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;

                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}