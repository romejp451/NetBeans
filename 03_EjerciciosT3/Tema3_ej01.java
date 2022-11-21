package tema3_ej1;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej1 {
    public static void main(String[] args) {
        String[] canciones={"Macarena_remix.mp3", "Bomba.mp3",
            "Paquitochocolatero.mp3", "Soypeor.mp3", "Venysanamidolor.mp3"};
        System.out.println("1- "+canciones[0]);
        System.out.println("2- "+canciones[1]);
        System.out.println("3- "+canciones[2]);
        System.out.println("4- "+canciones[3]);
        System.out.println("5- "+canciones[4]);
        System.out.println("Dime, que cancion quieres que salga?:");
        String cancion =new Scanner(System.in).nextLine();
        switch(cancion){
            case "1":
                System.out.println("Esta sonando "+canciones[0]+" ....");
                break;
            case "2":
                System.out.println("Esta sonando "+canciones[1]+" ....");
                break;
            case "3":
                System.out.println("Esta sonando "+canciones[2]+" ....");
                break;
            case "4":
                System.out.println("Esta sonando "+canciones[3]+" ....");
                break;
            case "5":
                System.out.println("Esta sonando "+canciones[4]+" ....");
                break;
            default:
                System.out.println("No has puesto ninguna cancion.");
                
        }
        
    }
    
}
