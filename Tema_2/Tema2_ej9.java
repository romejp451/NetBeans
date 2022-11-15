/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej9;
import bpc.daw.objetos.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej9 {

    public static void main(String[] args) {
        Caja c=null;
        c= new Caja("Bienvenidos al instituto");
        System.out.println("El mensaje con la caja cerrada es "+c.getMensaje());
        c.abrirCaja();
        System.out.println("El mensaje con la caja abierta es "+c.getMensaje());
        
    }
    
}
