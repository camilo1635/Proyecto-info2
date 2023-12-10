
package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jc777
 */
public class Pedido implements Calculo{
    private int idPedido;
    private String fechaCompra;
    private String estado;
    private List<Producto> productos; 
    private cliente cliente;
    

    public Pedido(int idPedido, String fechaCompra, String estado){
        this.idPedido=idPedido;
        this.fechaCompra=fechaCompra;
        this.estado=estado;
        this.productos=new ArrayList<>();
    }
    
    public void agregarnuevoproducto(Producto producto){
        productos.add(producto);
        producto.agregarnuevopedido(this);//linea de asociacion
    }
    
    public void asignarCliente(cliente cliente){
        this.cliente=cliente;
    }
    

    @Override
    public void calcularProductos() {//calcular total
            double total=0;
        
            for(Producto producto: productos){
                total += producto.getPrecio();
            }
            System.out.println("El total de los precios es: "+total);
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
