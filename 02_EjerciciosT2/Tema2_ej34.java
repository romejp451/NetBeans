package tema2_ej34;
import bpc.daw.reproductor.*;
import java.io.IOException;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej34 {
    public static void main(String[] args) {
        try{
           PlayList lista = new PlayList("C:/Users/Romeo/OneDrive/Escritorio/pruebas/p");
           Reproductor rep = new Reproductor(lista,true,false);
           rep.play();
        
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
        
    }
    
}
