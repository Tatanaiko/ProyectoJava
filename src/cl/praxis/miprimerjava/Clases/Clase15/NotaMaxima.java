package cl.praxis.miprimerjava.Clases.Clase15;

import java.util.ArrayList;
import java.util.Collections;

public class NotaMaxima {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(4.7);
        notas.add(2.2);
        notas.add(5.4);
        notas.add(6.9);
        notas.add(4.4);
        notas.add(2.6);


        double notaMaxima = obtenerNotaMaxima(notas);
        double notaMinima = obtenerNotaMinima(notas);


        System.out.println("Nota máxima: " + notaMaxima);
        System.out.println("Nota mínima: " + notaMinima);
    }


    public static double obtenerNotaMaxima(ArrayList<Double> notas) {
        return Collections.max(notas);
    }


    public static double obtenerNotaMinima(ArrayList<Double> notas) {
        return Collections.min(notas);
    }
}
