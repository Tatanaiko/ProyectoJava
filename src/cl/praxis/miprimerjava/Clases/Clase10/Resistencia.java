package cl.praxis.miprimerjava.Clases.Clase10;

import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float resistencia1;
        float resistencia2;
        float resistencia3;
        float resistenciat;

        do {
            System.out.println("Ingrese valor resistencia 1:");
            while (!sc.hasNextFloat()) {
                System.out.println("Por favor, ingrese un número válido:");
                sc.next(); // Limpiar la entrada inválida
            }
            resistencia1 = sc.nextFloat();
            if (resistencia1 <= 0) {
                System.out.println("La resistencia debe ser un valor positivo. Inténtelo de nuevo.");
            }
        } while (resistencia1 <= 0);

        do {
            System.out.println("Ingrese valor resistencia 2:");
            while (!sc.hasNextFloat()) {
                System.out.println("Por favor, ingrese un número válido:");
                sc.next(); // Limpiar la entrada inválida
            }
            resistencia2 = sc.nextFloat();
            if (resistencia2 <= 0) {
                System.out.println("La resistencia debe ser un valor positivo. Inténtelo de nuevo.");
            }
        } while (resistencia2 <= 0);

        do {
            System.out.println("Ingrese valor resistencia 3:");
            while (!sc.hasNextFloat()) {
                System.out.println("Por favor, ingrese un número válido:");
                sc.next();
            }
            resistencia3 = sc.nextFloat();
            if (resistencia3 <= 0) {
                System.out.println("La resistencia debe ser un valor positivo. Inténtelo de nuevo.");
            }
        } while (resistencia3 <= 0);

        resistenciat = (1 / ((1 / resistencia1) + (1 / resistencia2) + (1 / resistencia3)));
        System.out.println("La resistencia total es: " + resistenciat);
    }

}
    /* integrantes: Tiare Linco
                  Esteban Moya
                  Rudi Burk*/
