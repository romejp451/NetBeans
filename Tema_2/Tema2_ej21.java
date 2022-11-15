package tema2_ej21;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej21 {

    public static void main(String[] args) {
        System.out.println("Dime la ruta de un directorio");
        String ruta =new Scanner(System.in).nextLine();
        File archivo= new File(ruta);
        if(archivo.isDirectory()==true){
                System.out.println("La ruta es un directorio y contiene:"+archivo.listFiles());
            }else{
                System.out.println("Error, no existe directorio");         
        }
    }
    
}
