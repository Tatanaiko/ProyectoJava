package cl.praxis.miprimerjava.Desafios.desafio3;
import java.util.Scanner;

//public class Desafio3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int numero = 0;
//        System.out.println("Ingrese un número mayor a 0 para el límite del ejercicio: ");
//        numero = sc.nextInt();
//
//        for (int i = 1; i <= numero; i++) {
//            for (int k = 1; k <= numero - i; k++) {
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
public class Desafio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int i = 0;
        int a = i;
        int j = 0;
        int b = j;
        System.out.println("Ingrese un número mayor a 0 para el límite del ejercicio: ");
        numero = sc.nextInt();

        for (i = 1; i <= numero; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        int suma = sumar(i, j);
        System.out.println("Suma: " + suma);


        int resta = restar(i, j);
        System.out.println("Resta: " + resta);

        // Calcular la multiplicación
        int multiplicacion = multiplicar(i, j);
        System.out.println("Multiplicación: " + multiplicacion);

        // Calcular la división
        int division = dividir(i, j);
        System.out.println("División: " + division);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}