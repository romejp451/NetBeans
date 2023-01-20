package tema3_ej21;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej21 {
    public static void main(String[] args) {
        int[] numeros = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6};
        int contador =0;
        boolean esta = false;
        
        System.out.println("Dime un numero y te digo si esta en la lista y "
                + "cuantas veces se repite en ella");
        int num = new Scanner (System.in). nextInt();
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == num){
                contador++;
                esta= true;
            }
        }
        if(esta){
            System.out.println("El numero "+num+" esta en la lista y se encuentra "+contador+" veces");
        }
        else{
            System.out.println("El numero no se encuentra en la lista");
        }
        
    }
    
}
