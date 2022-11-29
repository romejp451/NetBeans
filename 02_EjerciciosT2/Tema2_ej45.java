package tema2_ej45;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej45 {
    public static void main(String[] args) {
      LocalDate fecha = LocalDate.of(2100, 2, 28);
      DayOfWeek dia = fecha.getDayOfWeek();
      System.out.println("El 28 de febrero de 2100 será " + dia);
        
    }
    
}
