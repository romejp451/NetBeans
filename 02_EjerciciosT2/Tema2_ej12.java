/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2_ej12;
import bpc.daw.objetos.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej12 {

    public static void main(String[] args) {
    MarcadorBaloncesto partido = new MarcadorBaloncesto("Estudiantes","CB Granada");
    

    
    boolean canasta = partido.anotarCanasta('L',2);
            canasta = partido.anotarCanasta('V',3);
            canasta = partido.anotarCanasta('L',2);
            canasta = partido.anotarCanasta('V',2);
            canasta = partido.anotarCanasta('V',3);
            canasta = partido.anotarCanasta('L',1);
            canasta = partido.anotarCanasta('L',1);
            canasta = partido.anotarCanasta('V',2);
             
            System.out.println(partido.toString());
            System.out.println("Esta ganando el equipo de "+partido.getNombreEquipoGanador());
            System.out.println("Esta perdiendo el equipo de "+partido.getNombreEquipoPerdedor());
    }
    
}
