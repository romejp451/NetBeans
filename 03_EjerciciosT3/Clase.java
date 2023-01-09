package clase;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Clase {
    public static void main(String[] args) {
        ArrayList Lista = new ArrayList();
        final int fin = 5;
        int numero;
        do{
            System.out.println("Dime un nombre, como maximo pueden acumularse 5");
            String nombre = new Scanner (System.in). nextLine();
            Lista.add(nombre);
            numero = Lista.size();
        }while(numero != fin);
        System.out.println("Los nombres introducidos son: "+Lista.toString());
    }
    
}
