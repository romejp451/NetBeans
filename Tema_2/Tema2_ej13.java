/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej13;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej13 {

    public static void main(String[] args) {
        System.out.println("Dime tu nombre listo");
        String n=new Scanner(System.in).nextLine();
        System.out.println("Tu nombre en mayusculas es: "+n.toUpperCase());
        System.out.println("Tu nombre en minusculas es: "+n.toLowerCase());
        System.out.println("El total de letras que contiene tu nombre es: "+n.length());
        
        
    }
    
}
