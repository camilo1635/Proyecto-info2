package com.mycompany.proyectofinal;

import java.util.Scanner;

/**
 *
 * @author jc777
 */
public class PROYECTOFINAL {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion, num = 0, num1;
        boolean menu = false;
        String nombre, direccion;

        //CREAMOS LOS OBJETOS DE LA TIENDA PARA VENDER//
        ComponentesHardware componente1 = new ComponentesHardware("4G", "15", "hola");//Parametrizado
        ComponentesHardware componente2 = new ComponentesHardware();//por defecto
        ComponentesHardware componente3 = new ComponentesHardware(componente2);//por copia

        PerifericosPC periferico1 = new PerifericosPC();
        PerifericosPC periferico2 = new PerifericosPC(periferico1);

        SoftwareAplicaciones aplicacion1 = new SoftwareAplicaciones();
        SoftwareAplicaciones aplicacion2 = new SoftwareAplicaciones(aplicacion1);
        SoftwareAplicaciones aplicacion3 = new SoftwareAplicaciones("Pastor Lopez", "Multiplataforma", 12.2, "gratis");

        //CREAMOS LOS CLIENTE//
        cliente cliente1 = new cliente();
        cliente cliente2 = new cliente("Juan", "Centro");
        cliente cliente3 = new cliente("Santiago", "La Esmeralda");

        //CREAMOS EL MENU PRINCIPAL//
        System.out.println("--------BIENVENIDO A EAZY SHOP----------");
        System.out.println("\nDigite su nombre: ");
        nombre = entrada.next();
        cliente1.setNombre(nombre);
        System.out.println("Digite su direccion: ");
        direccion = entrada.next();
        cliente1.setDireccion(direccion);
        System.out.println("\nSus datos son: " + cliente1.toString());
        

        //CREAMOS EL PEDIDO//
        Pedido pedido3 = new Pedido(30, "30/5/2005", "Disponible");
        
        //CREAMOS LA FACTURA//
        Factura factura1 = new Factura("Electronica","Efectivo",pedido3);
        
        
        while (!menu) {
            System.out.println("\nQue productos desea comprar?: ");
            System.out.println("1. " + periferico1.toString() + " Garantia: " + periferico1.getGarantia().getTiempo());
            System.out.println("2. " + periferico2.toString() + " Garantia: " + periferico2.getGarantia().getTiempo());
            System.out.println("3. " + componente1.toString());
            System.out.println("4. " + componente2.toString());
            System.out.println("5. " + componente3.toString());
            System.out.println("6. " + aplicacion1.toString());
            System.out.println("7. " + aplicacion2.toString());
            System.out.println("8. " + aplicacion3.toString());
            System.out.println("9. Calcular Promedio de compras");
            System.out.println("10. Calcular Precio total");
            System.out.println("11. Salir");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(periferico1);
                    periferico1.agregarnuevopedido(pedido3);
                    break;
                case 2:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(periferico2);
                    periferico2.agregarnuevopedido(pedido3);
                    break;
                case 3:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(componente1);
                    componente1.agregarnuevopedido(pedido3);
                    break;
                case 4:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(componente2);
                    componente2.agregarnuevopedido(pedido3);
                    break;
                case 5:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(componente3);
                    componente3.agregarnuevopedido(pedido3);
                    break;
                case 6:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(aplicacion1);
                    aplicacion1.agregarnuevopedido(pedido3);
                    break;
                case 7:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(aplicacion2);
                    aplicacion2.agregarnuevopedido(pedido3);
                    break;
                case 8:
                    pedido3.asignarCliente(cliente1);
                    pedido3.agregarnuevoproducto(aplicacion3);
                    aplicacion3.agregarnuevopedido(pedido3);
                    break;
                case 9:
                    pedido3.calcularPromedio();
                    break;
                case 10:
                    pedido3.calcularProductos();
                    break;
                case 11:
                    menu = true;
                    break;
            }
            
            try {
                if (opcion >= 12) {
                    throw new IllegalArgumentException("La opción digitada es incorrecta, vuelva a digitar: ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Se produjo una excepción: " + e.getMessage());
            }

        }

        System.out.println("Sus productos comprados fueron: " + pedido3.mostrarProductos());
        pedido3.descuento();
        System.out.println("\nDesea recomenda EAZY SHOP a otro cliente? ");
        System.out.println("1. Si");
        System.out.println("2. No");
        num1 = entrada.nextInt();
        if (num1 == 1) {
            System.out.println("Clientes: "
                    + "\n1. " + cliente2.getNombre() + "\n2. " + cliente3.getNombre());
            num = entrada.nextInt();
            switch (num) {
                case 1:
                    cliente1.setClienteReferido(cliente2);//autorelacion
                    System.out.println("\nEl cliente recomedado fue: " + cliente1.getClienteReferido().getNombre());
                    break;
                case 2:
                    cliente1.setClienteReferido(cliente3);
                    System.out.println("\nEl cliente recomedado fue: " + cliente1.getClienteReferido().getNombre());
                    break;
            }
            System.out.println("Su factura es la siguiente: "+factura1.toString()+"\nDatos de la compra: "+factura1.getPedido().toString());
            System.out.println("\n-------Gracias por comprar en EAZY SHOP!!---------");

        } else {
            System.out.println("Su factura es la siguiente: "+factura1.toString()+"\nDatos de la compra: "+factura1.getPedido().toString());
            System.out.println("\n-------Gracias por comprar en EAZY SHOP!!---------");
        }

    }
}
