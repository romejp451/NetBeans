package tema2_ej41;
import static java.lang.Math.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej41 {
    public static void main(String[] args) {
        System.out.println("El resultado de  (0.38*4.93)^-0.36 es :");
        double n1=0.38*4.93;
        double n2=-0.36;
        double elevado= pow(n1,n2);
        double solucion= (elevado);
        int redondeo;
        System.out.println(solucion);
        redondeo = (int) round(solucion);
        System.out.println("El redondeo del resultado es: "+redondeo);

    }
    
}
