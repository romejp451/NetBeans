package tema2_ej31;
import java.lang.Object.*;
import bpc.daw.musica.Instrumento.*;
import bpc.daw.musica.Piano.*;
import bpc.daw.musica.*;
import java.lang.String;
import bpc.daw.musica.Cancion.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej31 {
    public static void main(String[] args) {
        
     
     NotaMusical n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16 = null;
     Cancion c1 = null;
     c1 = new Cancion(null);
     
     n1= new NotaMusical(0,2);
     n2= new NotaMusical(0,2);
     n3= new NotaMusical(4,2);
     n4= new NotaMusical(4,2);
     n5= new NotaMusical(5,2);
     n6= new NotaMusical(5,2);
     n7= new NotaMusical(4,1);
     n8= new NotaMusical(3,3);
     n9= new NotaMusical(3,3);
     n10= new NotaMusical(2,3);
     n11= new NotaMusical(2,3);
     n12= new NotaMusical(1,4);
     n13= new NotaMusical(2,4);
     n14= new NotaMusical(3,4);    
     n15= new NotaMusical(1,4);
     n16= new NotaMusical(0,2); 
     
     c1.añadir(n1);
     c1.añadir(n2);
     c1.añadir(n3);
     c1.añadir(n4);
     c1.añadir(n5);
     c1.añadir(n6);
     c1.añadir(n7);
     c1.añadir(n8);
     c1.añadir(n9);
     c1.añadir(n10);
     c1.añadir(n11);
     c1.añadir(n12);
     c1.añadir(n13);
     c1.añadir(n14);
     c1.añadir(n15);
     c1.añadir(n16);
     
     Piano p = new Piano();
     Guitarra g = new Guitarra();
     
     p.reproducir(c1);
     g.reproducir(c1);
     
     
    }
    
}
