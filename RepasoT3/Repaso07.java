package repaso07;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso07 {
    public static void main(String[] args) {
        ArrayList num = new ArrayList();
        int fin = 10;
        int contador=0;
        double numero;
        
        while(contador !=fin){
            System.out.println("Dime un numero para la lista");
            numero = new Scanner (System.in). nextDouble();
            num.add(numero);
            contador++;
        }
        double max = (double) Collections.max(num);
        double min = (double) Collections.min(num);
        System.out.println("El numero mas grande de la lista es el "+max);
        System.out.println("El numero mas pequeño de la lista es el "+min);
        System.out.println("Y su localizacion en la array es MAX: "+(num.indexOf(max)));
        System.out.println("Y su localizacion en la array es MIN: "+(num.indexOf(min)));
    }
    
}
