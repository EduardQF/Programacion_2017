/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        List<String>lista=new ArrayList();
        for (int i = 0; i < 5; i++) {
            lista.add(JOptionPane.showInputDialog(null, "ingrese una palabra"));
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
