/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video15;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        Set<Persona> lista = new LinkedHashSet<>();
        for (int i = 0; i < 50; i++) {
            lista.add(newperson());
            System.out.println("i:"+i);
        }
        for (Persona p : lista) {
            System.out.println("p+"+p+"\nid:" + p.getId() + "\tnombre:" + p.getNombre());
        }
    }

    private static Persona newperson() {
        int edad = (int) (Math.random() * (20 - 0) + 0);
        String[] nombre = {"Eduardo", "Gustavo", "Daniel", "Mauricio", "Marla"};
        int id = (int) (Math.random() * (15 - 0) + 0);
        Persona p = new Persona(id, nombre[((int) (Math.random() * (4 - 0) + 0))], edad);
        return p;
    }
}
