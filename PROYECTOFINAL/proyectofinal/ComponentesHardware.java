/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author jc777
 */
public class ComponentesHardware extends Producto {

    private String capacidad;
    private String velocidad_reloj;
    private String interfaz;
    private String modelo;

    public ComponentesHardware() {//constructor por defecto
        super(1, "Procesador", " i5-12600 ", 20, 5);
        this.velocidad_reloj = "3.30 GHz";
        this.interfaz = "LGA";
        this.modelo = "Intel core";
        this.capacidad = null;
    }

    public ComponentesHardware(ComponentesHardware segundo) {//constructor por copia 
        super(2, " Memoria RAM ", " Fury", 40, 2);
        this.capacidad = " 8GB";
        this.velocidad_reloj = " 3.600mhz";
        this.interfaz = "DDR4";
        this.modelo = "Kingston";
    }

    public ComponentesHardware(String capacidad, String interfaz, String modelo) {//constructor parametrizadoo
        super(3, "Disco duro", "500GB", 20, 5);
        this.capacidad = capacidad;
        this.interfaz = interfaz;
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidad_reloj() {
        return velocidad_reloj;
    }

    public void setVelocidad_reloj(String velocidad_reloj) {
        this.velocidad_reloj = velocidad_reloj;
    }

    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "ComponentesHardware{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", capacidad=" + capacidad + ", velocidad_reloj=" + velocidad_reloj + ", interfaz=" + interfaz + ", modelo=" + modelo + '}';
    }

}
