/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import bpc.daw.objetos.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej11 {

    public static void main(String[] args) {
       Caja c1 = new Caja("Que pasaaa");
       Caja c2 = new Caja("Pues naadaaaa");
       
       c1.abrirCaja();
       c2.abrirCaja();
       
       String m1 = c1.getMensaje();
       String m2 = c2.getMensaje();
       System.out.println("el mensaje de la caja 1 es: "+m1);
       System.out.println("el mensaje de la caja 2 es: "+m2);
       
       
       boolean cambio =c1.cambiarMensaje(m2);
               cambio =c2.cambiarMensaje(m1);
        
       System.out.println("el mensaje de la caja 1 es: "+c1.getMensaje());
       System.out.println("el mensaje de la caja 2 es: "+c2.getMensaje());
    }
    
}
