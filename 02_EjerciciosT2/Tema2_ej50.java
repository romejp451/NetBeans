package tema2_ej50;
import java.util.ArrayList;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej50{
    
    public static void main(String[] args) {
        ArrayList mensajes = new ArrayList();
        mensajes.add("Programacion");
        mensajes.add("LDM");
        mensajes.add("SI");
        mensajes.add("BD");
        mensajes.add("Ingles");

        System.out.println("El tamaño de la lista es de "+mensajes.size()+" huecos");
        
        System.out.println("La tercera posicion corresponde a "+mensajes.get(2));
        
        System.out.println("El metodo toString es "+mensajes.toString());
        
        mensajes.remove(0);
        
        System.out.println("El tamaño de la lista es de "+mensajes.size()+" huecos");
        
        System.out.println("La tercera posicion corresponde a "+mensajes.get(2));

        System.out.println("El metodo toString es "+mensajes.toString());
    }
    
}