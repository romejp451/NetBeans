package tema3_ej31;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej31 {
    public static void main(String[] args) {
        
        System.out.println("Dime un numero entero");
        int num = new Scanner (System.in). nextInt();
        for(int x=0; x<=10; x++){
            System.out.println(num+" x "+x+" = "+num*x);
        }
    }
    
}
