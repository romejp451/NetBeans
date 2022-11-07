/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej2;
import bpc.daw.mario.*;
public class Tema2_ej2 {

    public static void main(String[] args) {
        String str1= "Buenas";
        Mario m1, m2= null;
        Seta s1= null;
        Luigi l1= null;
        Planta p1= null;
        Cañon c1= null;
        Disparo d1= null;
        
        
        m1= new Mario(100);
        
        m2= new Mario(640,320);
        
        Seta s= new Seta(0,0);
        
        Cañon c= new Cañon(100,320);
        
        Planta p=new Planta(400,500);
        Planta p2=new Planta(450,500);
        Planta p3=new Planta(500,500);
        
        Luigi l= new Luigi(200,200);
        Mario m3=new Mario(l,50);
        
    }
    
}
