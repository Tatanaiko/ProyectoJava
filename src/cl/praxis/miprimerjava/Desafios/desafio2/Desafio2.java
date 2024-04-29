package cl.praxis.miprimerjava.Desafios.desafio2;


import java.util.Scanner;


//        public class Desafio2 {
//            // Cambiar While por do while
//            public static void main(String[] args) {
//                int i = 0;
//                do {
//                    i += 1;
//                    System.out.printf("Iteración %d\n", i);
//                } while (i < 50);
//            }
//        }
//
//Fibonacci
//         public class Desafio2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese valor de secuencia de Fibonacci es: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Los primeros " + n + " elementos de la secuencia son:");
//        for (int i = 0; i <= n; i++) {
//            System.out.println(calcularFibonacci(i));
//        }
//    }
//
//    public static int calcularFibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
//        }
//    }
//}

//        public class Desafio2 {
//            //Solo pares 1
//            public static void main(String[] arg) {
//                Scanner sc = new Scanner(System.in);
//                int n;
//
//                do {
//                    System.out.println("Ingrese un numero par mayor a 0");
//                    n = sc.nextInt();
//
//                } while (n <= 0 || n % 2 != 0);
//
//
//                int resultado = 2;  // si lo cambio a 0 es la parte 1 del ejercicio
//                int contador = 0;
//
//
//                while (contador < n) {
//                    System.out.println(resultado);
//                    resultado += 2;
//                    contador++;
//
//                }
//            }
//        }
//
//

//    public class Desafio2 {
//        // Suma Impares
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Ingrese un número:");
//            int n = sc.nextInt();
//
//            int suma = 0;
//
//            for (int i = 1; i <= n; i += 2) {
//                suma += i;
//            }
//
//            System.out.println("La suma de los números impares hasta " + n + " es de:");
//            System.out.println(suma);
//        }
//    }

//
public class Desafio2 {
    //Suma Impar Limite
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int suma = 0;

        System.out.println("Ingrese el primer valor:");
        n1 = sc.nextInt();

        System.out.println("Ingrese el segundo valor:");
        n2 = sc.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                suma += i;

            }
        }
        System.out.println("La suma de los digitos entre el numero " + n1 + " y el numero " + n2 + " es de:");
        System.out.println(suma);
    }
}

