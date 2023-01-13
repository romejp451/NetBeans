package tema3_ej08;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej08 {
    public static void main(String[] args) {
        int contador = 1;
        
        System.out.println("Escribe una frase");
        String frase = new Scanner (System.in). nextLine();
        
        StringTokenizer fraccion = new StringTokenizer(frase, " ");
        
        while(fraccion.hasMoreTokens()==true){
            System.out.println(fraccion.nextToken());
            if(fraccion.hasMoreTokens()==true){
                contador++;
            } 
        }
        
        System.out.println("El numero de palabras en la frase es de "+contador);
        
        
        
        
    }
    
}
