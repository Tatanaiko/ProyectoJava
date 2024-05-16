package cl.praxis.miprimerjava.Clases.Clase23;

public class mainBotilleria {
    public static void main(String[] args) {

        Botella botella = new Botella("Negra","Kuntsman");
        Cerveza cerveza = new Cerveza(4500);
        Botilleria botilleria = new Botilleria("Donde Luchito", cerveza);

        System.out.println(botella);
        System.out.println(cerveza);
        System.out.println(botilleria);
    }
}
