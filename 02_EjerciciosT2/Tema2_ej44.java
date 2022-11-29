package tema2_ej44;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej44 {
    public static void main(String[] args) {
    
        LocalDate fechaActual = LocalDate.now();
        
        DateTimeFormatter formatoFechaDiaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoFechaDiaMesAno2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Fecha actual (dia/mes/ano): " + fechaActual.format(formatoFechaDiaMesAno));
	System.out.println("Fecha actual (dia-mes-ano): " + fechaActual.format(formatoFechaDiaMesAno2));
    }
    
    
}
