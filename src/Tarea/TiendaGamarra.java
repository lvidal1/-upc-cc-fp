package Tarea;

import java.util.Scanner;

public class TiendaGamarra {

    public static void inicio() {
        System.out.println("===============================================");
        System.out.println("-----------BIENVENIDO A GAMARRA SHOP-----------");
        System.out.println("===============================================");
    }

    public static void proceso() {
        System.out.println("-----------------------------------------------");
        System.out.println("===============CALCULANDO VENTA================");
        System.out.println("-----------------------------------------------");
    }

    public static void fin() {
        System.out.println("===============================================");
        System.out.println("-------------GRACIAS POR SU COMPRA-------------");
        System.out.println("===============================================");
    }

    public static void main(String[] args) {
        String producto;
        int cantidad;

        inicio();

        System.out.print("Ingrese el producto que desea comprar: ");
        Scanner pi = new Scanner(System.in);
        producto = pi.nextLine();

        System.out.print("Ingrese la cantidad que desea comprar: ");
        Scanner ci = new Scanner(System.in);
        cantidad = ci.nextInt();

        proceso();

        double descProducto = calcularDescInicial(producto);
        double descUnidades = calcularDescUnidades(cantidad);
        double descGeneral = descProducto + descUnidades;

        System.out.println("El descuento por producto es: " + descProducto + "%");
        System.out.println("El descuento por unidades es: " + descUnidades + "%");
        System.out.println("El descuento total de compra: " + descGeneral + "%");

        fin();

    }

    public static double calcularDescInicial(String producto) {
        double descInicial = 0.0;

        switch (producto.toUpperCase()) {
            case "PANTALON":
                descInicial = 8;
                break;
            case "POLO":
                descInicial = 5;
                break;
            case "CASACA":
                descInicial = 7;
                break;
            default:
                break;
        }

        return descInicial;
    }

    public static double calcularDescUnidades(int cantidad) {
        double descUnidades = 0.0;

        if(cantidad >= 1 && cantidad <= 11) {
            descUnidades = 0;
        }else if(cantidad >= 12 && cantidad <= 36) {
            descUnidades = 10;
        }else if(cantidad >= 37 && cantidad <= 72) {
            descUnidades = 20;
        }else if(cantidad >= 73 && cantidad <= 96) {
            descUnidades = 25;
        }else if(cantidad >= 97) {
            descUnidades = 30;
        }

        return descUnidades;
    }

}
