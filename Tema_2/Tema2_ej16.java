/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej16;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej16 {

    public static void main(String[] args) {
        System.out.println("Introduzca 2 frases que quiera que diga si coincide algun palabra entre ellas");
        String f1=new Scanner(System.in).nextLine();
        String f2=new Scanner(System.in).nextLine();
        System.out.println("La primera frase es: "+f1);
        System.out.println("La segunda frase es: "+f2);
        int n= f1.indexOf(f2);
        int n2= f2.indexOf(f1);
        if(n == -1 && n2 == -1){
            System.out.println("Las frases coinciden en alguna palabra? Falso");
        }else{
            System.out.println("Las frases coinciden en alguna palabra? Verdadero");
        }
    }
    
}
