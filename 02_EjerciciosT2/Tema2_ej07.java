/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej7;
import bpc.daw.objetos.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej7 {

    public static void main(String[] args) {
        DepositoAgua deposito = null;
        deposito= new DepositoAgua(15,50);
        deposito.dibujar();
        double capacidad=(50*15)/100;
        System.out.println("El cubo tiene "+capacidad+" litros de ocupacion");
        
    }
    
}
