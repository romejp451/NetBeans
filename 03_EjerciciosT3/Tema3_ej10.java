package tema3_ej10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej10 {
    public static void main(String[] args) {
        String ruta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo txt: ");
        ruta = sc.nextLine();
        sc.close();
        
        try {
            BufferedReader lee = new BufferedReader(new FileReader(ruta));
            String linea;
            while((linea = lee.readLine()) != null) {
                System.out.println(linea);
            }
            lee.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + ruta);
        }
    }
}
