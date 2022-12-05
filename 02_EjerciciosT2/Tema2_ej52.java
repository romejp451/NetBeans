package tema2_ej52;
import  java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej52 {
    public static void main(String[] args) {
        Map<String, Color> colores = new HashMap<>();
        Color Rojo = new Color (255,0,0);
        Color Amarillo = new Color (255,255,0);
        Color Verde = new Color (0,255,0);
        
        colores.put("12535ABC", Rojo);
        colores.put("98525KWX", Amarillo);
        colores.put("17632MSE", Verde);
        colores.put("85321ABC", Amarillo);
        
        System.out.println("El tamaño de el Map es de "+colores.size());
        System.out.println("El metodo toString es "+colores.toString());
        
        colores.values();
        
        System.out.println("Introduzca la matricula y le diré el color del coche");
        String matricula = new Scanner (System.in). nextLine();
        
        if(colores.containsKey(matricula)){
            System.out.println(colores.get(matricula));
        }else{
            System.out.println("La matricula no coincide");
        }

    }
}
