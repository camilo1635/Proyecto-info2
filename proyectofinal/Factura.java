package proyectofinal;

/**
 *
 * @author usuario
 */
public class Factura {
    private int idFactura;
    private String Tipodefactura;
    private String TipodePago;
    private Pedido pedido;
    
    public Factura(String tipodefactura, String tipodePago, Pedido pedido){
        this.idFactura=1;
        this.Tipodefactura=tipodefactura;
        this.TipodePago=tipodePago;
        this.pedido=pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getTipodePago() {
        return TipodePago;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getTipodefactura() {
        return Tipodefactura;
    }

    public void setTipodefactura(String Tipodefactura) {
        this.Tipodefactura = Tipodefactura;
    }

    
    public void setTipodePago(String TipodePago) {
        this.TipodePago = TipodePago;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", TipodeFactura=" + Tipodefactura + ", TipodePago=" + TipodePago + '}';
    }
}