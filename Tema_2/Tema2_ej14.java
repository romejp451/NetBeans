/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dime una frase cualquiera");
        String f=new Scanner(System.in).nextLine();
        System.out.println("La letra que se encuentra en el centro de la frase es: "+f.charAt(f.length()/2));
        
    }
    
}
