package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jc777
 */
public class cliente {

    private int idcliente;
    private String nombre;
    private String direccion;
    private cliente ClienteReferido;
    private Pedido pedido;

    public cliente() {
        this.idcliente = 1;
        this.nombre = "";
        this.direccion = "";
        this.ClienteReferido = null;
    }

    public cliente(String nombre, String direccion) {
        this.idcliente = 2;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ClienteReferido = null;
    }

    public void setClienteReferido(cliente ClienteReferido) {
        this.ClienteReferido = ClienteReferido;
    }

    public cliente getClienteReferido() {
        return ClienteReferido;
    }

    public void agregarnuevopedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + ", Su ID Cliente es: " + idcliente + ", Su direccion de residencia es: " + direccion + ", C: ";
    }

}
