/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video16;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import video12.Mascota;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    
    public static void main(String[] args) {
        Map<Persona,Mascota> map= new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String nombre= JOptionPane.showInputDialog(null,"ingrese nombre del dueño");
            int edad=Integer.valueOf( JOptionPane.showInputDialog(null,"ingrese edad del dueño"));
            String tipo= JOptionPane.showInputDialog(null,"ingrese tipo de macota que tiene");
            String nombreM= JOptionPane.showInputDialog(null,"ingrese nombre de la mascota");
            int edadM=Integer.valueOf( JOptionPane.showInputDialog(null,"ingrese edad de la mascota"));
            map.put(new Persona(i,nombre, edad),new Mascota(tipo, nombreM, edadM));
        }
        
        for(Entry ent:map.entrySet()){
            System.out.println("Propietario:"+ent.getKey()+"    mascota:"+ent.getValue());
        }
    }
}
