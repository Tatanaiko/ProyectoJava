package cl.praxis.miprimerjava.dias.diaOcho;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Temporizador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Bienvenidos a Temporizador");
        System.out.println("Ingrese un número para comenzar el temporizador en cuenta regresiva");
        num = sc.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fin del temporizador");

    }
}
