package tema2_ej35;
import java.time.LocalDate;
import java.time.DayOfWeek;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej35 {
    public static void main(String[] args) {
	LocalDate fecha = LocalDate.of(2100, 2, 28);
	DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
	System.out.println("El 28 de febrero de 2100 será " + diaDeLaSemana);  
        
        
        
    }
    
}
