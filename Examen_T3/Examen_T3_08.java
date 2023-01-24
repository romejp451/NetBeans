package examen_t3_08;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_08 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        String palabras;
        
        System.out.println("Dime 6 palabras");
        for(int x=0; x<6; x++){
            palabras = new Scanner(System.in). nextLine();
            if(palabras.contains("a")){
                lista.add(palabras+" contiene la a y esta en la posicion "+x);
            }
            else{
                lista.add(palabras+" esta en la posicion "+x);
            }
            
        }
        for(int x=0; x<6; x++){
            System.out.println(lista.get(x));
        }
    }
    
}
