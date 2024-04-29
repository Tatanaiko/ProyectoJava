package cl.praxis.miprimerjava.Desafios.desafio1;

import java.util.Scanner;

public class DesafioMejorado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cierre = false;
        int dia1 = 0, mes1 = 0, anio1 = 0;
        int dia2 = 0, mes2 = 0, anio2 = 0;

        do {
            System.out.println("Ingrese la primera fecha como DD/MM/AAAA");

            String a = sc.nextLine();

            if (a.length() != 10) {
                System.out.println("\u001B[31mLa entrada debe tener exactamente 10 caracteres. Ingrese formato DD/MM/AAAA\u001B[0m\n");
                continue;
            } else if (a.charAt(2) != '/' || a.charAt(5) != '/') {
                System.out.println("\u001B[31mLa entrada debe tener el formato DD/MM/AAAA\u001B[0m[31m\n");
                continue;
            } else {
                dia1 = Integer.parseInt(a.substring(0, 2));
                mes1 = Integer.parseInt(a.substring(3, 5));
                anio1 = Integer.parseInt(a.substring(6));

                if (dia1 < 1 || dia1 > 31 || mes1 < 1 || mes1 > 12 || anio1 < 1000) {
                    System.out.println("\u001B[31mLa fecha ingresada no es válida\u001B[0m");
                    continue;
                }
            }

            cierre = true;

        } while (!cierre);

        cierre = false;

        do {
            System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");

            String b = sc.nextLine();

            if (b.length() != 10) {
                System.out.println("\u001B[31mLa entrada debe tener exactamente 10 caracteres\u001B[0m\n");
                continue;
            } else if (b.charAt(2) != '/' || b.charAt(5) != '/') {
                System.out.println("\u001B[31mLa entrada debe tener el formato DD/MM/AAAA\u001B[0m\n");
                continue;
            } else {
                dia2 = Integer.parseInt(b.substring(0, 2));
                mes2 = Integer.parseInt(b.substring(3, 5));
                anio2 = Integer.parseInt(b.substring(6));

                if (dia2 < 1 || dia2 > 31 || mes2 < 1 || mes2 > 12 || anio2 < 1000) {
                    System.out.println("\u001B[31mLa fecha ingresada no es válida\u001B[0m");
                    continue;
                }
            }

            cierre = true;

        } while (!cierre);
    }
}