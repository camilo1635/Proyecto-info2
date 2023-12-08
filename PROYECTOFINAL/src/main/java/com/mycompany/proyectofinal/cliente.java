/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private List<Pedido> pedidos;
    //private List<ClienteReferido> referidos;
    private cliente ClienteReferido;
    
    public cliente(int idcliente, String nombre, String direccion){
        this.idcliente=idcliente;
        this.nombre=nombre;
        this.direccion=direccion;
        this.pedidos=new ArrayList<>();
        //this.referidos= new ArrayList<>();
        this.ClienteReferido = null;
    }

    public void setClienteReferido(cliente ClienteReferido) {
        this.ClienteReferido = ClienteReferido;
    }

    public cliente getClienteReferido() {
        return ClienteReferido;
    }
    

    public void actualizarInformacionPersonal(String nombre, String direccion){
        
    }
    
  
    public void verificarHistorialPagos(){
        
    }
    
    public void manejarPreferencias(){
        
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
    
    
}
