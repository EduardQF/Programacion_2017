/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video21;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(JOptionPane.showInputDialog(null,"ingrese frase "+i+" esribir a la inversa")).append(",");;
        }
        sb.reverse();
        String s=String.valueOf(sb);
        s.split(",", 4);
                
    }
}
