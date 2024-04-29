package cl.praxis.miprimerjava.dias.diaOcho;
import java.util.Scanner;
public class EjGuiados {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // sumar del 1 al 100
        // int suma=0;
//        System.out.println("Sumando del 1 al 100");
//        for (int i = 0; i <= 100; i++) {
//            suma += i;
//        }
//        System.out.println("La suma total es de " +suma);




        // Suma desde el numero indicado
//        int num1;
//        System.out.println("Sumando desde el 1 al N");
//        System.out.println("Ingrese el número hasta donde quiere sumar: ");
//        num1 = sc.nextInt();
//        for (int i =1 ; i <= num1; i++) {
//            suma += i;
//        }
//        System.out.println("La suma desde 1 hasta " + numSum + " es: " +suma);


        // Suma de numeros pares de  1 a N
//
//            int suma2=0;
//            int num2;
//            System.out.println("Sumando números par desde 1 al N");
//            System.out.println("Ingrese el número hasta donde quiere sumar: ");
//            num2 = sc.nextInt();
//            for (int i =1 ; i <= num2; i++) {
//                if (i % 2 == 0) {
//                    suma2 += i;
//                }
//            }
//            System.out.println("La suma desde 1 hasta " + num2 + " es: " +suma2);

        //Generador de listas HTML

        int items=0;
        String HTML="<ul>\n";
        System.out.println("Bienvenidos al Generador de listas en HTML");
        System.out.println("Ingrese la cantidad urls en la lista");
        items= sc.nextInt();
        for (int i=0; i<=items; i++){
            HTML+= "<li> item " + i + "</li>\n";
        }
        HTML += "</ul>\n";
        System.out.println(HTML);




    }
}
