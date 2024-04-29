package cl.praxis.miprimerjava.Desafios.Desafio4;
import java.util.Scanner;
public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenidos a patrones\n");
        do {
            System.out.println("           Menú\n");
            System.out.println("1.-   Patrón 1:   '*.'");
            System.out.println("2.-   Patrón 2:   '123'");
            System.out.println("3.-   Patrón 3:   '||*'");
            System.out.println("4.-   Salir\n");
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
                    System.out.println("Haz elegido el salir\n");
                    break;

                default:
                    System.out.println("Ingresa un número válido\n ");
            }
        } while (opcion != 4);
    }
    public static String Patron1(){
        //Patrón 1
        String patron1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón: ");
        int numero = sc.nextInt();
        for(int i = 0; i<= numero; i++){
            patron1 +="*.";
        }
        return patron1;
    }
    public static String Patron2(){
        //Patrón 2
        String patron2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón: ");
        int numero = sc.nextInt();
        for(int i = 1; i<= numero; i++){
            patron2 +=i;
        }
        return patron2;
    }

    public static String Patron3 () {
        String patron3="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el Patron: ");
        int numero = sc.nextInt();
        for(int i = 0; i<= numero; i++){
            patron3+="||*";
        }
        return patron3;
    }
}

