package proyectofinal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jc777
 */
public class PROYECTOFINAL {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion, num, num1, num2, num3;
        boolean menu = false;
        String nombre, direccion;

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        //CREAMOS LOS OBJETOS DE LA TIENDA PARA VENDER//
        ComponentesHardware componente1 = new ComponentesHardware();//Por defecto
        ComponentesHardware componente2 = new ComponentesHardware("500GB", "SATA", "WesternDigital");//Parametrizado
        ComponentesHardware componente3 = new ComponentesHardware(componente2);//por copia

        PerifericosPC periferico1 = new PerifericosPC();
        PerifericosPC periferico2 = new PerifericosPC(periferico1);

        SoftwareAplicaciones aplicacion1 = new SoftwareAplicaciones();
        SoftwareAplicaciones aplicacion2 = new SoftwareAplicaciones(aplicacion1);
        SoftwareAplicaciones aplicacion3 = new SoftwareAplicaciones("Microsoft", "Multiplataforma", 12.2, "No trasmisible");

        //CREAMOS LOS CLIENTE//
        cliente cliente1 = new cliente();
        cliente cliente2 = new cliente("Ana Maria", "Centro", 100000);
        cliente cliente3 = new cliente("Santiago Lopez", "La Esmeralda", 250000);

        //CREAMOS EL MENU PRINCIPAL//
        System.out.println("--------------BIENVENIDO A EASYSHOP-----------------");
        System.out.println("Digite su nombre: ");
        nombre = entrada.next();
        cliente1.setNombre(nombre);
        System.out.println("\nDigite su direccion: ");
        direccion = entrada.next();
        cliente1.setDireccion(direccion);

        System.out.println("\nHola " + cliente1.toString());

        //CREAMOS EL PEDIDO//
        Pedido pedido3 = new Pedido(30, "Disponible");

        //CREAMOS LA FACTURA//
        Factura factura1 = new Factura("Electronica", "Efectivo", pedido3);//agregacion

        while (!menu) {
            System.out.println("\nQue productos desea comprar?: ");
            System.out.println("Si compra mas de 2 productos se le hace un descuento del 30% de descuento en el total de la compra");
            System.out.println("\n1. " + periferico1.toString() + " Garantia: " + periferico1.getGarantia().getTiempo());
            System.out.println("2. " + periferico2.toString() + " Garantia: " + periferico2.getGarantia().getTiempo());
            System.out.println("3. " + componente1.toString());
            System.out.println("4. " + componente2.toString());
            System.out.println("5. " + componente3.toString());
            System.out.println("6. " + aplicacion1.toString());
            System.out.println("7. " + aplicacion2.toString());
            System.out.println("8. " + aplicacion3.toString());
            System.out.println("9. Calcular Promedio de compras");
            System.out.println("10. Calcular Precio total");
            System.out.println("11. Remover producto");
            System.out.println("12. Continuar con el pago");
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
                    System.out.println("\nProductos en el carro: ");
                    System.out.println(pedido3.mostrarProductos());
                    System.out.println("\nIngrese el número del producto que desea remover: ");
                    int numProducto = entrada.nextInt();
                    if (numProducto >= 1 && numProducto <= pedido3.getProductos().size()) {
                        Producto productoARemover = pedido3.getProductos().get(numProducto - 1);
                        pedido3.removerproducto(productoARemover);
                        System.out.println("Producto removido exitosamente.");
                    } else {
                        System.out.println("Número de producto no válido.");
                    }
                    break;

                case 12:
                    menu = true;
                    break;
            }
            try {
                if (opcion >= 13) {
                    throw new IllegalArgumentException("La opción digitada es incorrecta, vuelva a digitar: ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Se produjo una excepción: " + e.getMessage());
            }

            System.out.println("\nProductos agregados al carro: " + pedido3.toString());

        }

        System.out.println("\nElija metodo de pago: \n1. Efectivo \n2. Tarjeta de credito \n3. Nequi");
        num2 = entrada.nextInt();
        switch (num2) {
            case 1:
                factura1.setTipodePago("Efectivo");
                pedido3.realizarcompra();
                break;
            case 2:
                factura1.setTipodePago("Tarjeta de credito");
                pedido3.realizarcompra();
                break;
            case 3:
                factura1.setTipodePago("Nequi");
                pedido3.realizarcompra();
                break;
        }

        System.out.println("\nElija de que tipo quiere la factura: \n1. Electronica \n2. Fisica \n3. No la deseo");
        num3 = entrada.nextInt();
        switch (num3) {
            case 1:
                factura1.setTipodefactura("Electronica");
                break;
            case 2:
                factura1.setTipodefactura("Fisica");
                break;
            case 3:
                factura1.setTipodefactura("No la adquirio");
                break;
        }

        System.out.println("\nDesea recomendar EASY SHOP a otro cliente? ");
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
        }

        System.out.println("\nSu factura es la siguiente: " + factura1.toString() + " Fecha: " + formatoFecha.format(fecha) + "\nDatos de la compra: " + factura1.getPedido().toString());
        System.out.println("Su saldo base es: " + cliente1.getSaldoBase());
        pedido3.calcularPromedio();
        pedido3.calcularProductos();
        pedido3.realizarcompra();
        pedido3.descuento();
        System.out.println("\n-------Gracias por comprar en EASY SHOP!!---------");

    }
}
