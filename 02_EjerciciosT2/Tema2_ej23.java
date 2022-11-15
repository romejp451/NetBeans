package tema2_ej23;

import bpc.daw.objetos.TarjetaCredito;
import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej23 {

    public static void main(String[] args) {
        TarjetaCredito tc= null;
        System.out.println("Dime la contraseña para ver los datos de la tarjeta");
        int intento =new Scanner(System.in).nextInt();
        tc = new TarjetaCredito(1000,2222);
        
        try{
            tc.getSaldo(intento);
            System.out.println("La contraseña es correcta y tu saldo es de: "+tc.getSaldo(2222)+" euros.");
        }catch(Exception e){
            System.out.println("La contraseña es incorrecta");
        }
        
        
        System.out.println("Cuanto dinero quiere meter de la cuenta?");
        int mete =new Scanner(System.in).nextInt();
        System.out.println("Dime la contraseña para sacar "+mete+" euros de la tarjeta");
        int intento1 =new Scanner(System.in).nextInt();
        try{
            tc.ingresarDinero(mete);
            System.out.println("La contraseña es correcta y tu saldo actual es de: "+tc.getSaldo(2222)+" euros.");
        }catch(Exception e){
            System.out.println("La contraseña es incorrecta");
        }
        
        
        System.out.println("Cuanto dinero quiere sacar de la cuenta y la contraseña despues");
        int sacar2 =new Scanner(System.in).nextInt();
        int intento2 =new Scanner(System.in).nextInt();
        if (sacar2 < 1100){
        try{
            tc.sacarDinero(sacar2, 2222);
            System.out.println("La contraseña es correcta y tu saldo actual es de: "+tc.getSaldo(2222)+" euros.");
        }catch(Exception e){
            System.out.println("ERROR, la contraseña no es correcta");
        }}else{
              System.out.println("ERROR");
        }
        
    }
    
}
