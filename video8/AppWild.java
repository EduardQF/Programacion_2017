/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduard QF
 */
public class AppWild {

    public void listarUpperBound(List<? extends Persona> lista) {//clases inferiores
        for (Persona a : lista) {
            /* if (a instanceof Alumno) {
                System.out.println(((Alumno) a).getNombre());
            }else if (a instanceof Persona) {
                System.out.println(((Profesor) a).getNombre());
            }*/
            System.out.println(a.getNombre());

        }
    }

    public void listarLowerBound(List<? super Alumno> lista) {//clases superiores
        for (Object a : lista) {
            /* if (a instanceof Alumno) {
                System.out.println(((Alumno) a).getNombre());
            }else if (a instanceof Persona) {
                System.out.println(((Profesor) a).getNombre());
            }*/
            System.out.println(((Alumno)a).getNombre());

        }
    }
    
    public void listarUnBound(List<?> lista) {//clases superiores
        for (Object a : lista) {
            /* if (a instanceof Alumno) {
                System.out.println(((Alumno) a).getNombre());
            }else if (a instanceof Persona) {
                System.out.println(((Profesor) a).getNombre());
            }*/
            System.out.println(((Alumno)a).getNombre());

        }
    }

    public static void main(String[] args) {
        AppWild aw = new AppWild();

        Persona al1 = new Profesor("Eduardo");
        Alumno al2 = new Alumno("Giaccomo");
        Alumno al3 = new Alumno("Daniel");

        List<Persona> lista = new ArrayList<>();
        lista.add(al1);
        lista.add(al2);
        lista.add(al3);
        System.out.println("+++++++++++++++++++Upper+++++++++++\n");
        aw.listarUpperBound(lista);
        System.out.println("\n+++++++++++++++++++Upper+++++++++++\n");
        aw.listarLowerBound(lista);
        System.out.println("\n+++++++++++++++++++Upper+++++++++++\n");
        aw.listarUnBound(lista);
    }
}
