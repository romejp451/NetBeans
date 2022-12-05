package tema2_ej54;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej54 {
    public static void main(String[] args) {
        ArrayList palabras = new ArrayList();
        palabras.add("Programacion");
        palabras.add("LDM");
        palabras.add("SI");
        palabras.add("BD");
        palabras.add("Ingles");
        palabras.add("CSS");
        palabras.add("HTML");
        palabras.add("JS");
        palabras.add("Java");
        palabras.add("Python");
        
        System.out.println(palabras.toString());
        Collections.sort(palabras);
        
        System.out.println(palabras.toString());

    }
}
