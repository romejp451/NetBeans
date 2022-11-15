/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej20;
import java.io.File;
import java.util.Scanner;
import java.nio.file.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dime la ruta del archivo del disco duro");
        String ruta =new Scanner(System.in).nextLine();
        File archivo= new File(ruta);
        if((archivo.exists() == true)){
            System.out.println("La ruta existe");
            if(archivo.isDirectory()==true){
                System.out.println("La ruta es un directorio");
            }else{
                System.out.println("La ruta introducida es un archivo de tamaño: "+archivo.length()+" bytes");
                System.out.println("Desea eliminar el archivo: Si o No ");
                String eliminar=new Scanner(System.in).nextLine();
                if(eliminar == "Si"){
                    archivo.delete();
                }else{
                   System.out.println("El archivo no ha sido eliminado"); 
                }
            }
        }else{
            System.out.println("La ruta no existe");
        }
            
        
    }
    
}
