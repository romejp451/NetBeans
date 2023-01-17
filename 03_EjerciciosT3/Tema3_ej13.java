package tema3_ej13;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej13 {
    public static void main(String[] args) {
        System.out.println("Dime un numero del 1 al 12 que indique el mes");
        int mes = new Scanner (System.in). nextInt();
        System.out.println("Dime un año de que quieres qeu diga el mes que "
                + "introdujiste antes.");
        int año = new Scanner (System.in). nextInt();
        
        LocalDate fecha = LocalDate.of(año, mes, 1);
        DateTimeFormatter trans = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
        
        while(fecha.getMonthValue() == mes){
            System.out.println(fecha.format(trans));
            fecha = fecha.plusDays(1);
        }
        
    }
    
}
