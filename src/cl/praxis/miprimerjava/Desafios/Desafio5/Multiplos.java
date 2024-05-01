package cl.praxis.miprimerjava.Desafios.Desafio5;

import java.util.ArrayList;

public class Multiplos {
    public static void main(String[] args) {

        ArrayList<Integer> Multiplos3 = new ArrayList<>();
        for (String arg : args) {
            int numero = Integer.parseInt(arg);
            Multiplos3.add(numero);
        }

        int suma = Suma(Multiplos3);
        double promedio = Promedio(Multiplos3);

        System.out.println("El resultado de los multiplos de 3 es: " + suma + " y el del promedio es: " + promedio);

    }

    public static int Suma(ArrayList<Integer> Multiplo3) {
        int suma = 0;
        for (int numero : Multiplo3) {
            if (numero % 3 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static double Promedio(ArrayList<Integer> promedio) {
        int suma = 0;
        int contador = 0;
        for (int numero : promedio) {
            if (numero % 3 == 0) {
                suma += numero;
                contador++;

            }
        }
        if (contador == 0) {
            return 0;
        }
        return (double) suma / contador;
    }
}
