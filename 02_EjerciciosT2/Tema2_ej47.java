package tema2_ej47;
import java.awt.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej47 {
    public static void main(String[] args) {
        System.out.println("Dame la ruta de un archivo");
        String ruta= new Scanner(System.in). nextLine();
        File fila=new File (ruta);
        try{
            Desktop desktop = Desktop.getDesktop();
            if(fila.exists())
                desktop.open(fila);
        }catch(IOException e){
            System.out.println("ERROR "+e.getMessage());
        }
        
    }
    
}
