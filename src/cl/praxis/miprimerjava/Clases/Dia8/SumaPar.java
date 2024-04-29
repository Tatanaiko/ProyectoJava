package cl.praxis.miprimerjava.dias.diaOcho;

import java.util.Scanner;

public class SumaPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int par=0;
        System.out.println("Ingrese un número");
        num = sc.nextInt();

        if (num<=0) {
            System.out.println("El número ingresado no es válido");
        }else {
            for(int i=1; i<=num; i++){
                if(i%2==0){
                    par=i+par;
                }
            }
            System.out.println("El resultado es: " + par);
        }

    }
}
