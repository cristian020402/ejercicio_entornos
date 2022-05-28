package ejercicio_entornos;

import java.util.ArrayList;
import java.util.Scanner;

public class Productes {

    public static void  menuEntrada(ArrayList<Tenda> productos) {
        int opcion;
        int unidades;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Supermercado Chansum");
            System.out.println("");
            System.out.println("Pulsa 1 per al  access al Menu de Altes dels productes");
            System.out.println("Pulse 2 per accedir  al Menu de Ventes");
            System.out.println("Pulse 3 per a  eixir ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    menuProductos(productos);
                    break;
                }
                case 2: {
                    menuVentas(productos);
                    break;
                }
                case 3: {
                    System.out.println("Gracies! per utilitzar el programa");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }

        } while (opcion != 3);

    }

    public static void menuProductos(ArrayList<Tenda> productos) {
        String respuesta = "no";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println(" Menu de altes dels Productes ");

            productos.add(new Tenda());

            System.out.println("¿Vols donar de alta un altre Producte?");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

    }

    public static void menuVentas(ArrayList<Tenda> productos) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int unidades = 0;
        String respuesta;
        double factura = 0;
        do {
            System.out.println("Menu de ventes dels productes");
            System.out.println("");

            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Pulse " + i + " Per a  comprar " + productos.get(i).devolverNombre() + " el preu es de " + productos.get(i).devolverPrecio() + " y el stock es de " + productos.get(i).devolverStok() + " unitats");
            }

            opcion = teclado.nextInt();

            System.out.println("Has elegit comprar " + productos.get(opcion).devolverNombre());

            for (int i = opcion; i < productos.size(); i++) {

                unidades = unidades(productos);

                if (productos.get(i).quedaStock(unidades) == true) {
                    productos.get(i).modificarStock(unidades);
                    unidades = unidades * productos.get(i).devolverPrecio();
                }
                break;
            }

            factura = factura + unidades;

            System.out.println("¿Vols comprar un altre producte? (si/no)");
            respuesta = teclado.next();

        } while (respuesta.equalsIgnoreCase("si"));
    }

    static int unidades(ArrayList<Tenda> productos) {
    throw new UnsupportedOperationException("Not supported yet.");
    }
}
