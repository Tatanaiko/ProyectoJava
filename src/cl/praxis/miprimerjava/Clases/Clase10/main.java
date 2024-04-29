package cl.praxis.miprimerjava.Clases.Clase10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String nombre, apellido, direccion, ciudad;
        int numDireccion, telefono;

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese direccion: ");
        direccion = sc.nextLine();
        System.out.println("Ingrese el num de direccion: ");
        numDireccion = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la ciudad: ");
        ciudad = sc.nextLine();
        System.out.println("Ingrese el telefono: ");
        telefono = sc.nextInt();
        //%s variables textos     %d variables numericas         y \n espacio de linea
        String etiqueta = String.format(
                "De:%s %s\n"
                        +"Direccion:%s %d\n"
                        +"Ciudad:%s\n"
                        +"Contacto:%d\n",
                nombre, apellido, direccion, numDireccion,ciudad, telefono);
        System.out.println(etiqueta);
    }
}

