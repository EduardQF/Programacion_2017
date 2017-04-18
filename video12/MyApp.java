/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video12;

import video11.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        List<Mascota>lista=new ArrayList();
        lista.add(new Mascota("hamster", "toto", 12));
        lista.add(new Mascota("perro", "firulais", 120));
        lista.add(new Mascota("gato", "don cat", 24));
        lista.add(new Mascota("perro", "toto", 23));
        Collections.sort(lista);
        for(Mascota m:lista){
            System.out.println("nombre:"+m.getNombre()+"   tipo:"+m.getTipo());
        }
    }
}
