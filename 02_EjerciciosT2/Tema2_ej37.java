package tema2_ej37;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej37 {
    public static void main(String[] args) {
        System.out.println("Dime un numero entero y te lo digo en binario y en hexadecimal");
        int n = new Scanner (System.in). nextInt();
        
        String binario = Integer.toBinaryString(n);
        String hexa = Integer.toHexString(n);
        
        System.out.println("El numero en binario es "+binario+" y el numero en hexadecimal es "+hexa);
        
    }
    
}
