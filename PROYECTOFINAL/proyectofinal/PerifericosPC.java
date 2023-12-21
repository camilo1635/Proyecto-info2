package com.mycompany.proyectofinal;

/**
 *
 * @author jc777
 */
public class PerifericosPC extends Producto {

    private String tipo_conexion;
    private String fabricante;
    private int numero_de_puertos;
    private String color;
    private Garantia garantia;//composicion

    public PerifericosPC() {
        super(4, "Teclado", "Mecanico", 50000, 10);
        this.tipo_conexion = "USB";
        this.fabricante = "Razer";
        this.numero_de_puertos = 1;
        this.color = "Negro";
        this.garantia = new Garantia("1 Año");//composicion
    }

    public PerifericosPC(PerifericosPC segundo) {
        super(5, "Mouse", "Inalambrico", 30000, 30);
        this.tipo_conexion = "USB";
        this.fabricante = "Logitech";
        this.numero_de_puertos = 2;
        this.color = "blanco";
        this.garantia = new Garantia("3 meses");//composicion
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }

    public String getTipo_conexion() {
        return tipo_conexion;
    }

    public void setTipo_conexion(String tipo_conexion) {
        this.tipo_conexion = tipo_conexion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumero_de_puertos() {
        return numero_de_puertos;
    }

    public void setNumero_de_puertos(int numero_de_puertos) {
        this.numero_de_puertos = numero_de_puertos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PerifericosPC{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", tipo_conexion=" + tipo_conexion + ", fabricante=" + fabricante + ", numero_de_puertos=" + numero_de_puertos + ", color=" + color + '}';
    }

}
