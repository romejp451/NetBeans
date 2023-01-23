package tema3_ej25;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej25 {
    public static void main(String[] args) {
        int[] ceros= new int[500];
        
        for(int x=0; x<ceros.length; x++){
            ceros[x]=0;
        }
        
        for(int x=0; x<ceros.length; x++){
            if(x%2 !=0){
                ceros[x]=1;
            }
        }
        
        for(int x=0; x<ceros.length; x++){
            System.out.println("El numero en la posicion "+x+" es "+ceros[x]);
        }
    }
    
}
