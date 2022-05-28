package ejercicio_entornos;


import java.util.Scanner;

public class Tenda {
 
    String nombrePr;
    int stock;
    int precio;
 
    public Tenda() {
        solicitarNombrePro();
        solicitarStockPro();
        solicitarPrecioPro();
    }
 
    public static int solicitarProductos() {
        int numeroPro;
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("¿Cuants productes vols donar de alta?");
 
        numeroPro = teclado.nextInt();
        return numeroPro;
    }
    public void solicitarNombrePro(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Producte");
        System.out.println("Introduix  el nom del producte: ");
        nombrePr = teclado.nextLine();
    }
 
    public void solicitarStockPro(){
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduix el stock de: " + devolverNombre() + " : ");
        stock = teclado.nextInt();
    }
 
    public void solicitarPrecioPro(){
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduix el preu de: " + devolverNombre() + " : ");
        precio = teclado.nextInt();
    }
 
    public String devolverNombre(){
        return nombrePr;
    }
    public int devolverPrecio(){
        return precio;
    }
    public int devolverStok(){
        return stock;
    }
    public void modificarStock(int sto){
        stock = stock -sto;
        System.out.println("Venta realitzada.");
    }
    public boolean quedaStock(int sto){
 
        if (stock >= sto) {
 
            return true;
 
        } else {
 
            System.err.println("Error. Queden " + stock + " unitats");
 
            return false;
        }
    }
}