package cl.praxis.miprimerjava.Desafios.desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        String a = sc.nextLine();
        int dia1 = Integer.parseInt(a.substring(0,2));
        int mes1 = Integer.parseInt(a.substring(3,5));
        int anio1 = Integer.parseInt(a.substring (6));

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        String b = sc.nextLine();
        int dia2 = Integer.parseInt(b.substring(0,2));
        int mes2 = Integer.parseInt(b.substring(3,5));
        int anio2 = Integer.parseInt(b.substring (6));

        if (anio1 == anio2 && mes1 == mes2 && dia1 == dia2) {
            System.out.println("Tienen la misma edad");
        } else if (anio1 < anio2 || (anio1 == anio2 && mes1 < mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.println("La primera persona es mayor");
        } else {
            System.out.println("La segunda persona es mayor");
        }
    }
}