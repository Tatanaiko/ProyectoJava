package cl.praxis.miprimerjava.Desafios.Desafio12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportadorTxt extends  ExportarTxt{

    @Override
    public void exportar() {
        String nombreArchivo = "ficheros.txt";

        try {
            FileWriter filew = new FileWriter(nombreArchivo);
            BufferedWriter buffereredWriter = new BufferedWriter(filew);
            for (String datos : nombreArchivo) {
                buffereredWriter.write(datos);
                buffereredWriter.newLine();
            }
            buffereredWriter.close();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();

        }
    }
}
