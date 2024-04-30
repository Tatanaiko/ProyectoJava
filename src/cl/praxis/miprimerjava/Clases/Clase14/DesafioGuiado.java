package cl.praxis.miprimerjava.Clases.Clase14;

import java.util.ArrayList;
import java.util.Collections;

public class DesafioGuiado {
    public static void main(String[] args) {
                ordenar();
    }



    // metodo ordenar
    public static void ordenar() {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Cazuela");
        lista.add("Porotos");
        lista.add("Pastel de Choclo");
        lista.add("Aji de Gallina");
        lista.add("Ceviche");
        lista.add("Arepas");

        Collections.sort(lista);

        System.out.println("La lista de comida es " + lista);
    }
}

