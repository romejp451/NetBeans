package tema3_ej32;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej32 {
    public static void main(String[] args) {
        int suma=0; 
        
        for(int x=5; x<=13; x++){
            suma += Math.pow(x, 2);
        }
        System.out.println(suma);
    }
    
}
