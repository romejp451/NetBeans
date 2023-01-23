package repaso04;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso04 {
    public static void main(String[] args) {
        int contador = 0;
        double media1, media2, media3, n_examen, n_clase, act1, act2, act3, act4, total;
        ArrayList alum = new ArrayList();
        
        
        System.out.println("Cuantos alumnos hay en clase?");
        int num_alumnos = new Scanner(System.in). nextInt();
        if(num_alumnos>0){
            while( contador != num_alumnos ){
            System.out.println("Actividades del trimestre");
            
            System.out.println("Nota de las 4 actividades: ");
            System.out.println("Actividad 1:");
            act1 = new Scanner (System.in). nextDouble();
            System.out.println("Actividad 2:");
            act2 = new Scanner (System.in). nextDouble();
            System.out.println("Actividad 3:");
            act3 = new Scanner (System.in). nextDouble();
            System.out.println("Actividad 4:");
            act4 = new Scanner (System.in). nextDouble();
            media1 = ((act1+act2+act3+act4)/4)*0.3;
            
            System.out.println("Nota de examen: ");
            n_examen = new Scanner (System.in). nextDouble();
            media2 = n_examen*0.6;
            
            System.out.println("Nota de clase: ");
            n_clase = new Scanner (System.in). nextDouble();
            media3 = n_clase*0.1;
            
            total = media1+media2+media3;
            contador++;
            alum.add(total);
        }
            System.out.println("Dime el numero del alumno que quieres que te muestre la media de los"+num_alumnos+" que has introducido.");
            int numero = new Scanner(System.in). nextInt();
            System.out.println("El alumno numero "+numero+" tiene una media de "+alum.get(numero-1));
        }else{
            System.out.println("El numero que ha introducido es negativo.");
            System.out.println("Termina el programa");
        }
        
    }
    
}
