package tema3_ej33;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej33 {
    public static void main(String[] args) {
        System.out.println("Ingresa una frase: ");
        String frase = new Scanner(System.in).nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        
    }
    
}
