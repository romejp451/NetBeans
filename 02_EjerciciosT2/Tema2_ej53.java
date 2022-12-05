package tema2_ej53;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej53 {
    public static void main(String[] args) {
        TreeMap<String, Color> colores = new TreeMap<>();
        Color rojo = new Color (255,0,0);
        Color Amarillo = new Color (255,255,0);
        Color Verde = new Color (0,255,0);
        
        colores.put("12535ABC", rojo);
        colores.put("98525KWX", Amarillo);
        colores.put("17632MSE", Verde);
        colores.put("85321ABC", Amarillo);
        
        System.out.println("El tamaño de el Map es de "+colores.size());
        System.out.println("El metodo toString es "+colores.toString());
        
        System.out.println("No hay ningun cambio");
        
    }
    
}
