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
public class MyApp {
    public static void main(String[] args) {
        Set<Persona> lista =new HashSet<>();
        for (int i = 0; i < 10; i++) {
            lista.add(newperson());
        }
        for (Persona p:lista) {
            System.out.println("id:"+p.getId()+"\tnombre:"+p.getNombre());
        }
    }

    private static Persona newperson() {
        int edad=(int) (Math.random()*(80-0)+0);
        String[]nombre={"Eduardo","Gustavo","Daniel","Mauricio","Marla","Diego","Okumura","Ex"};
        int id=(int) (Math.random()*(80-0)+0);
        Persona p=new Persona(id, nombre[((int) (Math.random()*(7-0)+0))], edad);
        return p;
    }
}
