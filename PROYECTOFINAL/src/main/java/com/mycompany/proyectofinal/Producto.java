package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jc777
 */
public abstract class Producto implements Calculo {

    protected int idproducto;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected int stock;
    protected List<Pedido> pedidos;
   

    public Producto(int idproducto, String nombre, String descripcion, double precio, int stock) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.pedidos = new ArrayList<>();
    }

    public void ajustarPrecio() {

    }

    public void agregarnuevopedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    
    @Override
    public void calcularProductos() {//calcular promedio
        double sumaPrecios = 0;
        int cantidadTotalProductos = 0;

        for (Pedido pedido : pedidos) {
            for (Producto producto : pedido.getProductos()) {
                sumaPrecios += producto.getPrecio();
                cantidadTotalProductos++;
            }
        }
        if (cantidadTotalProductos > 0) {
            double promedio = sumaPrecios / cantidadTotalProductos;
            System.out.println("El promedio de precios de los productos es: " + promedio);
        } else {
            System.out.println("No hay productos para calcular el promedio.");
        }
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", pedidos=" + pedidos + '}';
    }

}
