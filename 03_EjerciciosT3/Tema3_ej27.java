package tema3_ej27;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej27 {
    public static void main(String[] args) {
        int contador =0;
        double nota, media=0;
        
        
        System.out.println("Dime la nota de los 10 examenes");
        while(contador !=10){
            nota = new Scanner (System.in). nextDouble();
            if(nota<0 && nota>10){
                System.out.println("La nota debe ser entre 0 y 10");
            }
            else{
                if(nota<=4){
                    System.out.println("El alumno esta suspenso");
                    contador=10;
                }
                else{
                    media+=nota;
                    contador++;
                }
            }
        }
        if(media/10 >5){
            System.out.println("La nota media del alumno es de "+media/10);
        }
        
        
    }
    
}
