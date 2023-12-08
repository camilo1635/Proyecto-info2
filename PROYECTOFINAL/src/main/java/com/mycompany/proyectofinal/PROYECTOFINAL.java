/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author jc777
 */
public class PROYECTOFINAL {

    public static void main(String[] args) {

        ComponentesHardware componente1 = new ComponentesHardware("4G", "15", "hola");
        ComponentesHardware componente2 = new ComponentesHardware();//por defecto
        ComponentesHardware componente3 = new ComponentesHardware(componente2);//por copia

        System.out.println("Primer objeto hardware: " + componente1.toString());
        System.out.println("Segundo objeto hardware: " + componente2.toString());
        System.out.println("Tercer objeto hardware: " + componente3.toString());

        PerifericosPC periferico1 = new PerifericosPC();
        PerifericosPC periferico2 = new PerifericosPC(periferico1);

        System.out.println("\nPrimer periferico: " + periferico1.toString());
        System.out.println("Segundo periferico: " + periferico2.toString());

        SoftwareAplicaciones aplicacion1 = new SoftwareAplicaciones();
        SoftwareAplicaciones aplicacion2 = new SoftwareAplicaciones(aplicacion1);
        SoftwareAplicaciones aplicacion3 = new SoftwareAplicaciones("Pastor Lopez", "Multiplataforma", 12.2, "gratis");

        System.out.println("\nPrimera aplicacion: " + aplicacion1.toString());
        System.out.println("Segunda aplicacion: " + aplicacion2.toString());
        System.out.println("Tercera aplicacion: " + aplicacion3.toString());

        Pedido pedido1 = new Pedido(100, "10/12/2009", "Activo");

        pedido1.agregarnuevoproducto(aplicacion3);
        pedido1.agregarnuevoproducto(aplicacion1);

        System.out.println("\nEl primer pedido contiene: " + pedido1);

        /*
        for (Pedido e : aplicacion1.getPedidos(){
            System.out.println("Los producto el pedido1 son: "+e.toString());
        }
         */
        
        cliente cliente1 = new cliente(200, "juan", "avenida panamericana");
        cliente cliente2 = new cliente(300, "milo", "Centro");

        cliente1.setClienteReferido(cliente2);//autorelacion
        cliente2.setClienteReferido(cliente1);

        System.out.println("\nEl cliente recomedado es por: "+cliente1.getClienteReferido().getNombre());
    }
}
