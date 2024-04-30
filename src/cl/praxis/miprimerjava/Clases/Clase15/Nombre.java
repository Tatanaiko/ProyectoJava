package cl.praxis.miprimerjava.Clases.Clase15;

import java.util.ArrayList;
import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Tiare");
        nombres.add("Emma");
        nombres.add("Eduardo");
        nombres.add("Matías");

        System.out.println("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = sc.nextLine();


        buscarNombre(nombres, nombreBuscado);

    }

    public static void buscarNombre(ArrayList<String> nombres, String nombreBuscado) {
        if (nombres.contains(nombreBuscado)) {
            // El nombre existe en el ArrayList, se muestra por consola
            System.out.println("El nombre " + nombreBuscado + " ha sido encontrado.");
        } else {
            // El nombre no existe en el ArrayList, se muestra un mensaje
            System.out.println("El nombre " + nombreBuscado + " no ha sido encontrado.");
            // Se eliminan los elementos que no fueron encontrados
            nombres.removeIf(nombre -> !nombre.equals(nombreBuscado));
            // Se muestra la lista actualizada por consola
            System.out.println("Elementos restantes en la lista: " + nombres);
        }
    }
}
