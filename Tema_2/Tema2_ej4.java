/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import bpc.daw.mario.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */

public class Tema2_ej4 {

    public static void main(String[] args) {
        Mario m1= null;
        Luigi l1= null;
        Mario m= new Mario(500,500);
        Luigi l= new Luigi(550,500);
        double distanciam= m.getDistanciaOrigen();
        double distancial= l.getDistanciaOrigen();
        System.out.println("Luigi esta en las coordenadas:"+ distanciam);
        System.out.println("Mario esta en las coordenadas:"+ distancial);
    }
    
}
