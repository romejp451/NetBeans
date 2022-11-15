/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej17;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej17 {

    public static void main(String[] args) {
        System.out.println("Digame su nombre de correo y luego su dominio");
        String nombre =new Scanner(System.in).nextLine();
        String dominio =new Scanner(System.in).nextLine();
        if (dominio.endsWith(".es") || (dominio.endsWith(".com"))){
            System.out.println("Tu correo es: "+nombre+""+dominio);
        }else{
            System.out.println("El domino es incorrecto");
        }
        
    }
    
}
