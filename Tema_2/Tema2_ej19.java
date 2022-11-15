/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej19;

import java.io.File;
import java.util.Scanner;
import java.nio.file.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej19 {

    public static void main(String[] args) {
        System.out.println("Dime la ruta al archivo");
        String ruta =new Scanner(System.in).nextLine();
        File archivo= new File(ruta);
        System.out.println("El tamaño de la ruta es de "+archivo.length()+" bytes");
        double megas= (archivo.length()/1048576);
        System.out.println("El tamaño de la ruta son "+megas+" Megabytes");
    }
    
}
