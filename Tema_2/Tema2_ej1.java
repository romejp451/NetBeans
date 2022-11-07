/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej1;
import java.lang.*;
import java.util.*;
import java.util.Scanner.*;
public class Tema2_ej1 {

    public static void main(String[] args) {
        int patas=4;
        String material= "madera";
        String madera= "roble";
        String esquinas= "redondas";
        double peso_max= 100;
        String romp= "Se rompe";
        String pinta= "De que color quiere que me pinte";
        String aguanta= "Aguanto";
        
        
        System.out.println("Soy una mesa, que quieres que haga.");
        System.out.println("Rompete");
        System.out.println(romp);
        System.out.println("Aguatate");
        System.out.println(aguanta);
        System.out.println("Pintate");
        System.out.println(pinta);
        String color=new Scanner(System.in).nextLine();
        System.out.println("Me pinto del color "+color);
  
        
        System.out.println("Cuanto peso puedes soportar encima?");
        System.out.println("Puedo soportar "+peso_max+" kilogramos");
        System.out.println("De que tipo de madera eres?");
        System.out.println("Soy de "+madera);
        System.out.println("Como tienes las esquinas?");
        System.out.println("Mis esquinas son "+esquinas);
        
    }
    
}
