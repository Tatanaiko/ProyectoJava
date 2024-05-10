package cl.praxis.miprimerjava.Desafios.Desafio6;

import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;

public class escritura {
    public static void main(String[] args) throws IOException {
        crearArchivo("directorio","fichero.txt");

    }

    public static void crearArchivo(String directorio, String fichero) throws IOException {

        File dir = new File("src/" + directorio);
        File archivo = new File(dir, fichero);

        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio.");
                return;
            }
        } else {
            System.out.println("El directorio ya existe.");
        }

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        try {
            FileWriter filew = new FileWriter(archivo);
            BufferedWriter buffereredWriter = new BufferedWriter(filew);
            for (String palabras : lista) {
                buffereredWriter.write(palabras);
                buffereredWriter.newLine();
            }
            buffereredWriter.close();
        }catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();

        }

    }
    public static void buscarTexto (String nombreFichero, String texto) throws FileNotFoundException {

        File archivo = new File("src/directorio/fichero.txt");

        if (!archivo.exists()) {
            System.out.println("El fichero ingresado no existe");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String palabras;
            int contador = 0;
            while ((palabras = br.readLine()) != null) {
                if (palabras.contains(texto)) {
                    contador++;
                }
            }
            System.out.println("La palabra \"" + texto + "\" se encuentra " + contador + " veces en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }

    }
}