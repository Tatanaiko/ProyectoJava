package cl.praxis.miprimerjava.Clases.Clase23;

public class Cerveza extends Botella{
    private int precio;

    public Cerveza() {
    }

    public Cerveza(String botella, String marca) {
        super(botella, marca);
    }

    public Cerveza(int precio) {
        this.precio = precio;
    }

    public Cerveza(String botella, String marca, int precio) {
        super(botella, marca);
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cerveza{" +
                "precio=" + precio +
                '}';
    }
}
