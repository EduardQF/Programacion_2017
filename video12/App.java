/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video12;


import video11.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Eduard QF
 */
public class App {
    
    int[] arreglo=new int[3];
    
     
    public static void main(String[] args) {
        List<Persona>lista =new ArrayList<>();
        lista.add(new Persona(0, "Eduardo", 19));
        lista.add(new Persona(1, "Gustabo", 14));
        lista.add(new  Persona(2, "Marco", 20));
        
        Collections.sort(lista);
        //Collections.reverse(lista);
        for (Persona p:lista) {
            System.out.println(p.getNombre());
        }
    }
}
