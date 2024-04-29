package cl.praxis.miprimerjava.Desafios.Desafio4;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenidos a Patrones anidados\n");
        do {
            System.out.println("           Menú\n");
            System.out.println("1.-   Patrón 1: Cuadrados con *");
            System.out.println("2.-   Patrón 2: Z con *");
            System.out.println("3.-   Patrón 3: X con x");
            System.out.println("4.-   Patrón 4: l con *");
            System.out.println("5.-   Salir\n");
            System.out.println("Elige una opción");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Opción inválida. Por favor, ingrese un número.");
                sc.nextLine();
                opcion = 0;
            }

            switch (opcion) {

                case 1:
                    System.out.println("Haz elegido el primer Patron\n ");
                    String patron1 = Patron1();
                    System.out.println(patron1);
                    break;
                case 2:
                    System.out.println("Haz elegido el segundo Patron\n ");
                    String patron2 = Patron2();
                    System.out.println(patron2);
                    break;

                case 3:
                    System.out.println("Haz elegido el tercer Patron\n ");
                    String patron3 = Patron3();
                    System.out.println(patron3);
                    break;

                case 4:
                    System.out.println("Haz elegido el tercer Patron\n ");
                    String patron4 = Patron4();
                    System.out.println(patron4);
                    break;

                case 5:
                    System.out.println("Haz elegido el salir\n");
                    break;

                default:
                    System.out.println("Ingresa un número válido\n ");
            }
        } while (opcion != 5);
    }

    public static String Patron1() {
        //Patrón 1
        String patron1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == 0 || i == numero - 1 || j == 0 || j == numero - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        return patron1;
    }

    public static String Patron2() {
        //Patrón 2
        String patron2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón: ");
        int numero = sc.nextInt();
        System.out.println(" ");

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == 0 || i == numero - 1 || j ==  numero - i - 1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
        return patron2;
    }

    public static String Patron3() {
        String patron3 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j || j == numero - i - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        return patron3;
    }
    public static String Patron4() {
        String patron4 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón: ");
        int numero = sc.nextInt();

        for(int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++){
                if ((i != 0 && j == 0) || (i != numero - 1 && j == numero - 1)){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        return patron4;
    }
}