package cl.praxis.miprimerjava.Clases.Clase23;

public class Botilleria {
    private String nombre;
    private Cerveza cerveza;

    public Botilleria() {
    }

    public Botilleria(String nombre, Cerveza cerveza) {
        this.nombre = nombre;
        this.cerveza = cerveza;
    }

    public Cerveza getCerveza() {
        return cerveza;
    }

    public void setCerveza(Cerveza cerveza) {
        this.cerveza = cerveza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Botilleria{" +
                "cerveza=" + cerveza +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
