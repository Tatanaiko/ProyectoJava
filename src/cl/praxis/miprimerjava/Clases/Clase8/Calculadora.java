package cl.praxis.miprimerjava.dias.diaOcho;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        int opcion;

        System.out.println("Bienvenido a Cálculadora");
        System.out.println("Recuerde utilizar ',' para realizar operaciones con decimales");

        do {

            System.out.println("Ingrese el primer número");
            num1 = sc.nextDouble();
            System.out.println("Ingrese el segundo número");
            num2 = sc.nextDouble();

            System.out.println("Menú: ");

            System.out.println("1. Sumar");

            System.out.println("2. Restar");

            System.out.println("3. Multiplicar");

            System.out.println("4. Dividir");

            System.out.println("5. Salir");

            System.out.println("Ingrese el número para solicitar la acción");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: "+ (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado ed la multiplicación es: "+ (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    } else System.out.println("No se puede dividir por cero.");
                    break;
                case 5:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese el número para solicitar la acción");

            }
        }while (opcion != 5);
    }
}
