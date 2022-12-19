package practica1;
import java.lang.Object.*;
import java.util.Scanner;
import bpc.daw.objetos.TarjetaCredito;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Practica1 {
    public static void main(String[] args) {
        TarjetaCredito tCredito = new TarjetaCredito(100,1111);
        int saldo;
        String termina = "T";
        String letra;
        int contador = 0;
        boolean correcto=false;
        int cont = 1111;
        
        
        while(contador < 3 && !correcto){
            System.out.println("Introduce la contraseña de la cuenta");
            int contraseña = new Scanner (System.in). nextInt();
            System.out.println("La contraseña marcada es "+contraseña);
        
        
        if(contraseña == cont){
            System.out.println("Contraseña correcta");
        do{
            System.out.println("Pulse 'I' si necesita ingresar dinero");
            System.out.println("Pulse 'R' si necesita retirar dinero");
            System.out.println("Pulse 'S' si necesita revisar el saldo de su cuenta");
            System.out.println("Pulse 'T' si quiere terminar el programa");
            letra = new Scanner (System.in). nextLine();
            
            switch(letra){
                case "I":
                    System.out.println("Cuanto dinero quiere ingresar?");
                    int ingresar = new Scanner (System.in). nextInt();
                    if(ingresar >0){
                    try{
                        tCredito.ingresarDinero(ingresar);
                        System.out.println("Se ha ingresado "+ingresar+" euros a la cuenta");
                    }catch (Exception e){
                        System.out.println("Error "+e.getMessage());
                    }
                    }else{
                        System.out.println("No se puede ingresar un numero negativo o 0");
                    }
                break;
                case "R":
                    System.out.println("Cuanto dinero quiere retirar?");
                    int retirar = new Scanner (System.in). nextInt();
                    try{
                        if(retirar < tCredito.getSaldo(1111)){
                        tCredito.sacarDinero(retirar, 1111);
                        System.out.println("Se ha retirado "+retirar+" euros de la cuenta");
                    }else{
                        System.out.println("El dinero que ha intentado sacar es menor al que tiene en la cuenta");
                    }
                    }catch (Exception e){
                        System.out.println("Error "+e.getMessage());
                    }
                    
                break;
                case "S":
                    try{
                        System.out.println("Su sueldo es de "+tCredito.getSaldo(1111));
                    }catch(Exception e){
                        System.out.println("Error "+e.getMessage());
                    }
                break;
                case "T":
                    System.out.println("El programa a terminado");
                default:
                    System.out.println("No ha hecho ninguna acción, pulse alguna de las teclas 'I' 'R' 'S' o 'T'");
            }
            
        }while(letra != termina);
        
        }else{
            System.out.println("Contraseña mal");
        }
    
        } 
    }
    
}
