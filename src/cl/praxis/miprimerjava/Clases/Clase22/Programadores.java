package cl.praxis.miprimerjava.Clases.Clase22;

public class Programadores extends Persona{
    private String lenguaje;

    public Programadores(String nombre, String rut, double altura, String lenguaje) {
        super(nombre, rut, altura);
        this.lenguaje = lenguaje;
    }

    public Programadores(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    // Getters y setters


    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    //toString


    @Override
    public String toString() {
        return "Programadores{" +
                "nombre='" + getNombre() + '\'' +
                ", lenguaje='" + lenguaje + '\'' +
                '}';
    }
}
