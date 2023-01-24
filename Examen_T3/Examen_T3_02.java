package examen_t3_02;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_02 {
    public static void main(String[] args) {
        boolean continua = true;
        int contador=0;
        double media, num, total=0;
        
        while(continua){
            System.out.println("Escribe los numeros que quieras y tienes como limite el 10000");
            num = new Scanner(System.in). nextDouble();
            if(num>0){
                total+= num;
                contador++;
                if(total>=10000){
                    continua = false;
                }
            }
            else{
                System.out.println("El numero que debe introducir es positivo");
            }
        }
        media= total/contador;
        System.out.println("La media entre los numeros es de "+media);
        System.out.println("El total de todos los numeros sumados es "+total);
        System.out.println("Y el numero de numeros introducidos es de "+contador);
    }
    
}
