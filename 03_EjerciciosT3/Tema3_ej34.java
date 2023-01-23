package tema3_ej34;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej34 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int num = new Scanner (System.in). nextInt();
        for(int x=1; x<=num; x++){
            if(num%x ==0){
                System.out.println(x);
            }
        }
    }
    
}
