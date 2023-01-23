package tema3_ej35;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej35 {
    public static void main(String[] args) {
        int numero, contador=0;
        
        System.out.println("Dime un numero y te digo si es primo");
        numero = new Scanner (System.in). nextInt();
        
        for(int x =1; x<=numero; x++){
            if(numero%x ==0){
                contador++;
            }
        }
        
        if(contador==2){
            System.out.println("El numero es primo");
        }
        else{
            System.out.println("El numero no es primo");
        }
    }
    
}
