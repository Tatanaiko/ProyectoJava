package cl.praxis.miprimerjava.Clases.Clase22;

public class Persona {
    private String nombre;
    private String rut;
    private double altura;

    // Constructores

    public Persona(String nombre, String rut, double altura) {
        this.nombre = nombre;
        this.rut = rut;
        this.altura = altura;
    }

    public Persona() {
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //toString


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", altura=" + altura +
                '}';
    }
}
