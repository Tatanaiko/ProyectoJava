package cl.praxis.miprimerjava.Clases.Clase15;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("mesa");
        elementos.add("Refrigerador");
        elementos.add("Cocina");
        elementos.add("lavadora");

        String option;

        do {

            System.out.println("Agrega algun elemento de la casa en la lista: ");
            String elementoCasa = sc.nextLine();

            if (!elementos.contains(elementoCasa)) {
                elementos.add(elementoCasa);
                System.out.println("Se ha agregado el elemento: " + elementoCasa);
            } else {
                System.out.println("El elemento ya existe");
            }

            System.out.println("Si no quieres seguir, escribe 'salir', sino, sigue agregando elementos");
            option = sc.nextLine();

        }while (!option.equalsIgnoreCase("salir"));
        }
    }

