package tema2_ej25;

import java.io.File.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej25 {
    public static void main(String[] args) {
        FileReader archivo;
        BufferedReader lector;
        File crear = new File("C:/Users/Romeo/OneDrive/Documentos/pruebas/frases.txt");
        try{
            crear.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        PrintWriter pepe;
        System.out.println("Dime 2 frases");
        String f1 =new Scanner(System.in).nextLine();
        String f2 =new Scanner(System.in).nextLine();
        try{
            pepe= new PrintWriter("C:/Users/Romeo/OneDrive/Documentos/pruebas/frases.txt");
            pepe.println(f1);
            pepe.println(f2);
            pepe.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            archivo = new FileReader ("C:/Users/Romeo/OneDrive/Documentos/pruebas/frases.txt");
            if (archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) !=null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("No se ha podido leer el archivo.");
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
        
    }
    
}
