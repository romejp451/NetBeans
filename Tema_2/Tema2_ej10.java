/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import bpc.daw.objetos.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caja c = new Caja("Buenas noches");
       c.abrirCaja();
       String mensaje = c.getMensaje();
       System.out.println("el mensaje es: "+mensaje);
       
       boolean cambio =c.cambiarMensaje("Buenos dias");
       mensaje = c.getMensaje();
       System.out.println("el mensaje es: "+mensaje);
        
    }
    
}
