/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej18;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej18 {

    public static void main(String[] args) {
        System.out.println("Dime tu correo electronico completo y lo desscomopondre");
        String correo =new Scanner(System.in).nextLine();
        int numero = correo.indexOf("@");
        String nombre = correo.substring(0,numero);
        String dominio = correo.substring(numero+1,correo.length());
        
        System.out.println("El nombre del correo es: "+ nombre);
        System.out.println("El dominio del correo es: "+ dominio);
    }
    
}
