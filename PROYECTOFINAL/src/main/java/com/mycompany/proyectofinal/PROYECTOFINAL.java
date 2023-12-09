/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

import java.util.Scanner;

/**
 *
 * @author jc777
 */
public class PROYECTOFINAL {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int id, opcion;
        String nombre, direccion;

        
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
            Pedido pedido2 = new Pedido(330, "30/11/2034", "Inactivo");
            pedido1.agregarnuevoproducto(aplicacion3);
            pedido2.agregarnuevoproducto(aplicacion1);

            System.out.println("\nEl primer pedido contiene: " + pedido1);

            /*
        for (Pedido e : aplicacion1.getPedidos(){
            System.out.println("Los producto el pedido1 son: "+e.toString());
        
             */
            cliente cliente1 = new cliente();
            cliente cliente2 = new cliente();

            System.out.println("Digite su nombre: ");
            nombre = entrada.next();
            cliente1.setNombre(nombre);
            System.out.println("Digite su direccion: ");
            direccion = entrada.next();
            cliente1.setDireccion(direccion);
            System.out.println("\nSus datos son: " + cliente1.toString());

            System.out.println("Que productos desea comprar?: ");
            System.out.println("1. " + periferico1.toString());
            System.out.println("2. " + periferico2.toString());
            System.out.println("3. Salir del menú de compras");
            opcion = entrada.nextInt();

            Pedido pedido3 = new Pedido(30, "30/5/2005", "Disponible");
            pedido3.agregarnuevoproducto(periferico1);
            pedido3.agregarnuevoproducto(periferico2);
            
            periferico1.agregarnuevopedido(pedido3);
            aplicacion1.agregarnuevopedido(pedido3);
            
            double promedio = pedido3.calcularPromedioProductos();
            System.out.println("El promedio de pedidos es: " + promedio);

            
            
            switch (opcion) {
                case 1:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(periferico1);
                case 2:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(periferico2);
                case 3:
                    break;
                }
            

        cliente1.setClienteReferido(cliente2);//autorelacion
        cliente2.setClienteReferido(cliente1);

        System.out.println("\nEl cliente recomedado es: " + cliente1.getClienteReferido().getNombre());

        cliente1.agregarnuevopedido(pedido1);
        pedido2.asignarCliente(cliente2);
        
        

        System.out.println("\nEl cliente compro: " + pedido3.toString());
        
        
    }
}
