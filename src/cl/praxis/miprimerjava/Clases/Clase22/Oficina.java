package cl.praxis.miprimerjava.Clases.Clase22;

import java.util.ArrayList;
import java.util.List;

public class Oficina  extends Persona{
    private JefeProyecto jefeProyecto;
    private Programadores programadores;
    int cantidadPuesto;

    public Oficina(String nombre, String rut, double altura, JefeProyecto jefeProyecto, Programadores programadores, int cantidadPuesto) {
        super(nombre, rut, altura);
        this.jefeProyecto = jefeProyecto;
        this.programadores = programadores;
        this.cantidadPuesto = cantidadPuesto;
    }

    public Oficina(String nombre, String rut, double altura) {
        super(nombre, rut, altura);
    }

    public Oficina() {
    }

    public Oficina(JefeProyecto jefeProyecto, Programadores programadores, int cantidadPuesto) {
        this.jefeProyecto = jefeProyecto;
        this.programadores = programadores;
        this.cantidadPuesto = cantidadPuesto;
    }

    public JefeProyecto getJefeProyecto() {
        return jefeProyecto;
    }

    public void setJefeProyecto(JefeProyecto jefeProyecto) {
        this.jefeProyecto = jefeProyecto;
    }

    public Programadores getProgramadores() {
        return programadores;
    }

    public void setProgramadores(Programadores programadores) {
        this.programadores = programadores;
    }

    public int getCantidadPuesto() {
        return cantidadPuesto;
    }

    public void setCantidadPuesto(int cantidadPuesto) {
        this.cantidadPuesto = cantidadPuesto;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "jefeProyecto=" + jefeProyecto +
                ", programadores=" + programadores +
                ", cantidadPuesto=" + cantidadPuesto +
                '}';
    }
}





