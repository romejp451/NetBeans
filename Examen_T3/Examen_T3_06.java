package examen_t3_06;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_06 {
    public static void main(String[] args) {
        int[] ceros= new int[5000];
        
        for(int x=0; x<ceros.length; x++){
            ceros[x]=0;
        }
        
        for(int x=0; x<ceros.length; x++){
            if(x%2 !=0){
                ceros[x]=1;
            }
        }
        
        for(int x=0; x<ceros.length; x++){
            System.out.println("El numero que esta en la posicion "+x+" es "+ceros[x]);
        }
        
            
    }
    
}
