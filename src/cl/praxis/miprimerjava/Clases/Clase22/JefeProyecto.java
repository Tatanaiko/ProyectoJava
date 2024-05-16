package cl.praxis.miprimerjava.Clases.Clase22;

public class JefeProyecto extends Persona{

    private String area;

    public JefeProyecto(String nombre, String rut, double altura, String area) {
        super(nombre, rut, altura);
        this.area = area;
    }

    public JefeProyecto(String area) {
        this.area = area;
    }

    public JefeProyecto() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "JefeProyecto{" +
                "area='" + area + '\'' +
                '}';
    }
}
