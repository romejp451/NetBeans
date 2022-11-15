package tema2_ej24.pkg2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej242 {
    public static void main(String[] args) {
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
        
    }
    
}
