package tema2_ej40;
import java.lang.Runtime;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej40 {
    public static void main(String[] args) {
        Runtime a = Runtime.getRuntime();
        
        int proc = a.availableProcessors();
        long memoria = a.totalMemory();
        
        System.out.println("El numero de procesadores es de "+proc+
                " y la memoria total dedicada al programa de java es de "+memoria);
        
    }
    
}
