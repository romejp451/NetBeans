/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej15;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave= "Tengo sueño";
        System.out.println("Introduce la contraseña correcta campeon");
        String c=new Scanner(System.in).nextLine();
        System.out.println("¿La clave es la misma? "+ c.equals(clave));
    }
    
}
