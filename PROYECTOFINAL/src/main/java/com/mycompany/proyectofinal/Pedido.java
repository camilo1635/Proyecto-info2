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
    public void calcularProductos() {//calcular total
        double sumaPrecios = 0;

        for (Producto producto : productos) {
            sumaPrecios += producto.getPrecio();
            producto.calcularProductos();
        }

        if (!productos.isEmpty()) {
            System.out.println("La suma de precios de los productos es: " + sumaPrecios);
        } else {
            System.out.println("No hay productos para calcular la suma de precios.");
        }
    }
    
    public void calcularPromedio(){//llamar a la funcion de la clase Producto
        for (Producto producto : productos) {
            producto.calcularProductos();
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
