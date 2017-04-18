/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video11;


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
        
        //Collections.sort(lista, new NombreCompareitor());
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona per1, Persona per2) {
                int rpta=0;
                if (per1.getEdad()> per2.getEdad()) {
                    rpta=1;
                }else if(per1.getEdad()< per2.getEdad()){
                    rpta=-1;
                }else {
                    rpta=0;
                }
                return rpta;
            }
        });
        //Collections.reverse(lista);
        for (Persona p:lista) {
            System.out.println(p.getNombre());
        }
    }
}
