/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) {
        List <String>lista=new ArrayList<>();
        lista.add("MitoCode");
        //lista.add(25);
        
        String texto=(String) lista.get(0);
        
        String[] array=new String[5];
        array[0]="MitoCode";
        array[1]="1";
        
        Generico <String,Integer,String,Double> c=new Generico<>("Eduardo",25,"Dani",25.0);
        c.mostrar();
        
    }
}
