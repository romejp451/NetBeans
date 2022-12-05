package tema2_ej51;
import java.util.HashSet;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej51 {
    public static void main(String[] args) {
        HashSet lista = new HashSet();
        
        lista.add("silla");
        lista.add("mesa");
        lista.add("niño");
        lista.add("mesa");
        lista.add("casa");
        lista.add("silla");
        lista.add("lapiz");
        
        System.out.println("El tamaño de la lista es de "+lista.size());
        System.out.println("La lista contiene "+lista.toString());
        //Esto sucede ya que en las Set<T> no puede haber ningun hueco de la lista repetido, entonces cuando detecta alguna repeticion elimina una de ellas.
    }
    
}
