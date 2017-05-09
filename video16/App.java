/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video16;

import video15.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) {
        Set<Persona>lista=new LinkedHashSet<>(); 
        lista.add(new Persona(1, "MitoCode", 22));
        lista.add(new Persona(2, "Code", 23));
        lista.add(new Persona(3, "Mito", 24));
        lista.add(new Persona(4, "Jaime", 25));
        lista.add(new Persona(3, "AAA", 24));
        lista.add(new Persona(6, "Mito", 27));
        
        for (Persona persona:lista) {
            System.out.println(persona.getId() +"-"+persona.getNombre()+"-"+persona.getEdad());
        }
    }
}
