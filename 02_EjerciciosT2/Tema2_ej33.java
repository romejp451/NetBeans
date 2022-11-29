package tema2_ej33;
import bpc.daw.reproductor.*;
import java.io.IOException;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej33 {
    public static void main(String[] args) {
        
        ArchivoMP3 archivo= new ArchivoMP3("C:\\Users\\Romeo\\Downloads\\"
                +"onlymp3.to-Tyga,Ozuna-AyyMacarenaREMIX(LetraLyrics)--"
                +"mTmf0v9bno-192k-1654462248008.mp3");
        ArchivoMP3 archivo2= new ArchivoMP3("C:\\Users\\Romeo\\Downloads\\"
                +"onlymp3.to-Kingafrica-Bomba-QlPS16NeBO0-192k-1654167236821.mp3");
        ArchivoMP3 archivo3= new ArchivoMP3("C:\\Users\\Romeo\\Downloads\\"
                +"onlymp3.to - Daddy Yankee Llamado De Emergencia Soundtrack "
                +"Talento de Barrio © El Cartel Records-ekFaaEU8Yuw-192k-1654238320900.mp3");     
        ArchivoMP3 [] lista={archivo, archivo2, archivo3};
        
        PlayList p= new PlayList();
        p.setTitulo("Temardos");    
        p.añadirVarias(lista);
        
        try{
         p.guardar("C://Users//Romeo//OneDrive//Escritorio//pruebas//p"); 
         }catch(IOException e){
               System.out.println("Error "+e.getMessage());
               }
        
        Reproductor rep= new Reproductor(p,true,true);
        rep.play();
    }
    
}
