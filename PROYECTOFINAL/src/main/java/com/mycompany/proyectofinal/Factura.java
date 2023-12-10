package com.mycompany.proyectofinal;

/**
 *
 * @author usuario
 */
public class Factura {
    private int idFactura;
    private String Tipo;
    private String TipodePago;
    private Pedido pedido;
    
    public Factura(String tipo, String tipodePago, Pedido pedido){
        this.idFactura=1;
        this.Tipo=tipo;
        this.TipodePago=tipodePago;
        this.pedido=pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getTipodePago() {
        return TipodePago;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", Tipo=" + Tipo + ", TipodePago=" + TipodePago + '}';
    }
    
    
}
