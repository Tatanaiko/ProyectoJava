package cl.praxis.miprimerjava.Desafios.Desafio5;
import java.util.ArrayList;
public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> ClearSteps = new ArrayList<>();
        for (String arg : args) {
            int pasos = Integer.parseInt(arg);
            if (pasos >= 200 && pasos <= 100000){
                ClearSteps.add(pasos);
            }
        }
        double promedio = Promedio(ClearSteps);

        System.out.println("El promedio de los pasos es de: " + promedio);
    }

    public static double Promedio(ArrayList<Integer> steps) {
        if (steps.isEmpty ()) {
            return 0;
        }

        int suma = 0;
        for (int paso: steps) {
            suma += paso;
        }
        return (double) suma / steps.size();
    }
}
