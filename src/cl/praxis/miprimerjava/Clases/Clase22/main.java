package cl.praxis.miprimerjava.Clases.Clase22;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        JefeProyecto jefeProyecto = new JefeProyecto("Tiare", "18597963-5", 1.80, "La más pulenta");
        Oficina oficina = new Oficina();

        List<Programadores> listaProgramadores = new ArrayList<>();

        // Agregar cuatro programadores a la lista
        Programadores programador1 = new Programadores("Eduardo", "12345678-9", 1.75, "Java");
        Programadores programador2 = new Programadores("Emma", "98765432-1", 1.80, "Python");
        Programadores programador3 = new Programadores("Mati", "98761234-5", 1.70, "JavaScript");
        Programadores programador4 = new Programadores("Yayo", "87654321-0", 1.65, "C#");

        listaProgramadores.add(programador1);
        listaProgramadores.add(programador2);
        listaProgramadores.add(programador3);
        listaProgramadores.add(programador4);

        for (Programadores programador : listaProgramadores) {
            System.out.println(programador);
        }

        // Imprimir el jefe de proyecto
        System.out.println(jefeProyecto);

        // Imprimir la oficina
        System.out.println(oficina);

    }
}
