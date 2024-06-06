package cl.praxis.miprimerjava.Desafios.Desafio12;

import java.util.ArrayList;

public class ProductoServicio {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    public ProductoServicio() {
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos () {
        System.out.println("--------------------Lista de Productos----------------------");
        for (Producto producto : listaProductos) {
            System.out.println(getListaProductos());
            System.out.println("---------------------------------------------------------");
        }
    }

    public void agregarProductos () {
        System.out.println("---------------Productos agregados---------------------------");
        listaProductos.add(new Producto());
        System.out.println("--------------------------------------------------------------");
    }


}
