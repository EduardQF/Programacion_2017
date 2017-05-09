/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video13;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) {
        Set<Persona> lista =new HashSet<>();
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "Mito", 22));
        lista.add(new Persona(1, "code", 22));
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "AAA", 22));
        
        for (Persona elemento:lista) {
            System.out.println(elemento.getNombre());
        }
    }
}
