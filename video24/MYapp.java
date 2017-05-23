/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video24;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MYapp {
    public static void main(String[] args) {
        int num1=0,num2=0;
        try {
            num1=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 1 a ser sumado"));
            num2=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 2 a ser sumado"));
            System.out.println("la suma de los numeros es:"+(num1+num2));
        } catch (NullPointerException|NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
