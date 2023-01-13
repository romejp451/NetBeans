package tema3_ej04;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej04 {
    public static void main(String[] args) {
        boolean pagina = true;
        String si = "si";
        String no = "no";
        String edad;
        
        while (pagina == true){
            System.out.println("Eres mayor de edad? si/no");
            edad = new Scanner (System.in). nextLine();
            
            if(edad.equals(si)){
                System.out.println("El usuario es mayor de edad.");
                pagina = false;
            }else{
                if(edad.equals(no)){
                System.out.println("El usuario es menor de edad.");
                pagina = false;
                    }else{
                        System.out.println("No te entiendo");
                }
            }
            
        }
                
        
        
        
        
    }
    
}
