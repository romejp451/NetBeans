package tema3_ej29;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej29 {
    public static void main(String[] args) {
        String [] contenedor =  {"Hola", "Casa", "Caballo", 
            "Hacha", "Manzana", "Ventana", "Tortuga", "Raton", "Mesa"};
        String [] ingles =  {"Hola: Hello", "Casa: House", "Caballo: Horse", 
            "Hacha: Axe;", "Manzana: Apple", "Ventana: Winow", "Tortuga: Turtle", 
            "Raton: Mouse", "Mesa: Table"};
        String palabra;
        
        System.out.println("Dime una palabra de las indicadas en el enunciado "
                + "y te la digo en ingles");
        palabra = new Scanner(System.in). nextLine();
        for(int x=0; x<9; x++){
            if(palabra.equals(contenedor[x])){
                System.out.println(ingles[x]);
            }
        }
        
    }
    
}
