package tema3_ej09;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un valor que darle a N");
        double N = sc.nextDouble();
        double S = 1, A = 1;
        boolean pepe= true;
        if(N>=0){
            
            while(pepe){
                S= 0.5*(A +(N/A));
            if((Math.abs(S-A)) < 0.000001){
                pepe=false;
            }   
            do{
                A=S;
            }while((Math.abs(S-A)) > 0.000001);
            }
         }
        System.out.println("La raiz cuadrada aproximada es "+S);
        System.out.println("El programa ha terminado");
    }
    
}
