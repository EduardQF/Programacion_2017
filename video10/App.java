/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Eduard QF
 */
public class App {
    
    int[] arreglo=new int[3];
    
     
    public static void main(String[] args) {
        List<String>lista =new ArrayList<>();
        lista.add("Eduardo");
        lista.add("Gustabo");
        lista.add("jajajaja");
        
        //Collections.sort(lista);
        Collections.reverse(lista);
        System.out.println(lista);
    }
}
