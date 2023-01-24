package examen_t3_05;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int aleatorio;
        
        do {
            aleatorio = random.nextInt(11);
            System.out.println(aleatorio);
        }while (aleatorio != 10);
        
        System.out.println("Fin del programa.");
    }
    
}
