package tema2_ej32;
import bpc.daw.reproductor.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej32 {
    public static void main(String[] args) {
        ArchivoMP3 archivo= new ArchivoMP3("C:\\Users\\Romeo\\Downloads\\onlymp3.to-Tyga,Ozuna-AyyMacarenaREMIX(LetraLyrics)--mTmf0v9bno-192k-1654462248008.mp3");
        
        Reproductor rep = new Reproductor (archivo, false, true);
        rep.play();
        System.out.println("Titulo de la cancion: "+ archivo.getTitulo()+"\nAutor: "+archivo.getAutor()+"\nDuracion: "+archivo.getDuracion());
        
    }
    
}
