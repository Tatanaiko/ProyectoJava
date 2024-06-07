package cl.praxis.miprimerjava.Desafios.Desafio12;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Exportador {

    public abstract void exportar(ArrayList<Producto> listaProductos) throws IOException;

}
