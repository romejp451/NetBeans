package repaso03;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso03 {
    public static void main(String[] args) {
        boolean compra= true;
        String producto;
        double precio;
        ArrayList lista_compra = new ArrayList();
        String cierre;
        double suma = 0;
        
        while(compra){
            System.out.println("Nombre del producto:");
            producto = new Scanner(System.in). nextLine();
            System.out.println("Precio del producto");
            precio = new Scanner(System.in). nextDouble();
            suma += precio;
            lista_compra.add(producto+": "+precio+" euros");
            System.out.println("Desea introducir algun produto mas? SI/NO");
            cierre = new Scanner (System.in). nextLine();
            if(cierre.equals("NO")){
                compra=false;
            }
        }
        System.out.println("La cantidad de productos es de: "+lista_compra.size());
        System.out.println("El precio total de la compra es de: "+suma);
    }
    
}
