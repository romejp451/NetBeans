package tema3_ej28;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej28 {
    public static void main(String[] args) {
        String contraseña= "pepe", usuario;
        
        for(int x=5; x>0; x--){
            System.out.println("Dime la contraseña, tiene "+x+" intentos");
            usuario = new Scanner (System.in). nextLine();
            if(contraseña.equals(usuario)){
                System.out.println("Contraseña correcta");
                x =0;
            }
            else{
                System.out.println("Error");
            }
        }
    }
    
}
