
package ejercicio_entornos;

import static ejercicio_entornos.Productes.menuEntrada;
import java.util.ArrayList;
import java.util.Scanner;

public class Ventes {
    public static int unidades(ArrayList<Tenda> productos) {
        Scanner teclado = new Scanner(System.in);
        int unidades;
 
        System.out.println("¿Quantes unitats vols?");
        unidades = teclado.nextInt();
 
        return unidades;
     
 

    
    }

 public static void main(String[] args, String factura) {
        Scanner teclado = new Scanner(System.in);
 
        ArrayList<Tenda> productos = new ArrayList<>();
 
        menuEntrada(productos);
        System.out.println("El total de su compra es: " + factura + "â‚¬");
 
    }

    private static void menuEntrada(ArrayList<Tenda> productos) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
 
    

