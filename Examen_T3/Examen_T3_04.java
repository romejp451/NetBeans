package examen_t3_04;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_04 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero entero y positivo");
        int num = new Scanner (System.in). nextInt();
        
        for(int x =1; x<=num; x++){
            for(int y=1; y<=x;y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }
    
}
