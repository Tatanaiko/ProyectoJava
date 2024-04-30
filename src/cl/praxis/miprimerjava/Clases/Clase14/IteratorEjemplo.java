package cl.praxis.miprimerjava.Clases.Clase14;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorEjemplo {
    public static void main(String[] args) {
        ArrayList<String> random = new ArrayList<String>();

        random.add("Primero");
        random.add("Segundo");
        random.add("Tercero");
        random.add("Cuarto");
        random.add("Quinto");

        for (String elemento : random) {

            System.out.println("El elemento es " + elemento);
        }
    }

//    public static void Matriz (){
//        int auxiliar;
//        int n=3;
//        int matrizEjemplo[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        for (int i=0; i<auxiliar.length; i++){
//            for (int j=0; j<auxiliar.length; j++){ // no deberia ser n?
//                System.out.println(matrizEjemplo[i][j] + "\t");
//            }
//        }
//
//    }

}

