package cl.praxis.miprimerjava.Clases.Clase15;

public class PromedioSueldo {

    //Promedio Sueldos
    public static void main(String[] args) {
        System.out.println("Promedio de sueldo");
        int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300,
                700450, 442300 };

        double promedio = Promedio(sueldos);
        System.out.println("El promedio de los sueldos mayores a 500000 es: " + promedio);
    }

    public static double Promedio(int[] sueldos) {

        int suma=0;
        int contador=0;

        for (int sueldo : sueldos){
            if (sueldo > 500000) {
                suma += sueldo;
                contador++;
            }
        }
        return (double) suma / contador;
    }
}
