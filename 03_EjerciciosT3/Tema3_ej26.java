package tema3_ej26;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej26 {
    public static void main(String[] args) {
        String [] palabras= new String [6];
        int contador =0;
        
        for(int x=0; x<6; x++){
            System.out.println("Dime una palabra");                      
            palabras [x]= new Scanner (System.in).nextLine();
        }
        
        for(int x=0; x<6; x++){
            for(int j=0; j<palabras[x].length(); j++){
                if(palabras[x].charAt(j) == 'a'){
                    contador++;
                }
            }
        }
        System.out.println("Hay "+contador+" palabras con la letra 'a'.");
    }
    
}
