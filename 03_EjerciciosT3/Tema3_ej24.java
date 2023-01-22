package tema3_ej24;
import java.util.*;
import java.lang.*;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej24 {
    public static void main(String[] args) {
        
        System.out.println("Dime un numero del 1 al 12 para determinar el mes");
        int num = new Scanner (System.in). nextInt();
        if(num<1 || num>12){
            System.out.println("Error \nEl programa ha terminado");
        }
        else{
            List<LocalDate> lista = new ArrayList();
            LocalDate fecha = LocalDate.of(2023, num, 1);
            while(fecha.getMonthValue() == num){
                lista.add(fecha);
                fecha = fecha.plusDays(1);
            }
            System.out.println(lista);
            System.out.println("El tamaño de la lista es de "+lista.size());
        }
    }
    
}
