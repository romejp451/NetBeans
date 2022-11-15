/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import bpc.daw.objetos.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej8 {

    public static void main(String[] args) {
        DepositoAgua d1,d2 = null;
        d1= new DepositoAgua(15,20);
        d2= new DepositoAgua(5,20);
        d1.dibujar();
        d2.dibujar();
        System.out.println("Y despues de los cambios seria asi:");
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.dibujar();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.dibujar();
        
    }
    
}
