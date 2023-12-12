package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jc777
 */
public class Pedido implements Calculo {

    private int idPedido;
    private String fechaCompra;
    private String estado;
    private List<Producto> productos;
    private cliente cliente;

    public Pedido(int idPedido, String fechaCompra, String estado) {
        this.idPedido = idPedido;
        this.fechaCompra = fechaCompra;
        this.estado = estado;
        this.productos = new ArrayList<>();
    }

    public void agregarnuevoproducto(Producto producto) {
        productos.add(producto);
        producto.agregarnuevopedido(this);//linea de asociacion
    }

    public String mostrarProductos() {
        String mostrar = "";
        for (int i = 0; i < productos.size(); i++) {
            mostrar += productos.get(i).toString();
        }
        return mostrar;
    }

    public void asignarCliente(cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void calcularProductos() {//calcular precio total
        double sumaPrecios = 0;

        for (Producto producto : productos) {
            sumaPrecios += producto.getPrecio();
        }

        if (!productos.isEmpty()) {
            System.out.println("La suma de precios de los productos es: " + sumaPrecios);
        } else {
            System.out.println("No hay productos para calcular la suma de precios.");
        }
    }

    public void descuento() {
        double descuento;
        double sumaPrecios = 0;
        int cantidadTotalProductos = 0;

        for (Producto producto : productos) {
            sumaPrecios += producto.getPrecio();
            cantidadTotalProductos++;
        }

        if (cantidadTotalProductos > 2) {
            descuento = sumaPrecios * 0.3;
            System.out.println("Su descuento fue de: " + descuento);
        } else {
            System.out.println("No aplica descuento");
        }
    }

    public void calcularPromedio() {//llamar a la funcion de la clase Producto
        double sumaPrecios = 0;
        int cantidadTotalProductos = 0;

        for (Producto producto : productos) {
            sumaPrecios += producto.getPrecio();
            cantidadTotalProductos++;
        }

        if (cantidadTotalProductos > 0) {
            double promedio = sumaPrecios / cantidadTotalProductos;
            System.out.println("El promedio de precios de los productos es: " + promedio);
        } else {
            System.out.println("No hay productos para calcular el promedio.");
        }
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fechaCompra=" + fechaCompra + ", estado=" + estado + ", productos=" + productos + '}';
    }

}
