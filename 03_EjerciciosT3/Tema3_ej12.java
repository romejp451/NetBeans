package tema3_ej12;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej12 {
    public static void main(String[] args) {
        boolean nota_valida = true;
        double nota;
        ArrayList num = new ArrayList();
        double media = 0;
        int contador = 0;
        
        do{
            System.out.println("Dime la nota de los alumnos");
            nota = new Scanner (System.in). nextDouble();
            if(nota > -1 && nota <=10){
                num.add(nota);
                media += nota;
                contador ++;
            }   
            else{
                if(nota == -1){
                    nota_valida = false;
                }
                else{
                    System.out.println("El numero que introdujiste es negativo o mayor a 10, introduzca uno nuevo");
                }
            }
        }while(nota_valida);
        
        double max = (double) Collections.max(num);
        double min = (double) Collections.min(num);
        System.out.println("El numero mas grande de los que has inroducido es "+max);
        System.out.println("El numero mas pequeño de los que has inroducido es "+min);
        System.out.println("La nota media es de "+(media/contador));
    }
    
}
