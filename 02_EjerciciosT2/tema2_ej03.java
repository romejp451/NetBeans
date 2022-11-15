/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import bpc.daw.mario.*;

public class tema2_ej3 {

    public static void main(String[] args) {
        Seta s1= null;
        Mario m1= null;
        Luigi l1= null;
        Cañon c1= null;
        Disparo d1= null;
        int x= 100;
        int y =400;
        int X= 400;
        int Y= 400;
        
        Seta s= new Seta(200,0);
        s.andarHacia(0,0);
        Mario m= new Mario(400,200);
        m.saltar();
        Luigi l= new Luigi(400, 400);
        Cañon c= new Cañon(100, 400);
        Disparo d= new Disparo( 100, 400, 400, 400);
        Planta p= new Planta(500,500);
        p.comer(true);
        Planta p2= new Planta(550,500);
        p2.comer(true);
        Planta p3= new Planta(600,500);
        p3.comer(true);
        
    }
    
}
