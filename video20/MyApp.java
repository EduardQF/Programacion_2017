/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video20;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append(JOptionPane.showInputDialog(null,"ingrese frase a esribir a la inversa"));
        sb.append(",").append(JOptionPane.showInputDialog(null,"ingrese otra frace"));
        System.out.println(sb.reverse());
    }
}
