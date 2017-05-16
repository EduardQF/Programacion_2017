/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video17;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) throws InterruptedException {
        Stack<Persona>pila=new Stack<>();
        for (int i = 0; i < 5; i++) {
            int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "ingres edad","persona "+i));
            String nombre=JOptionPane.showInputDialog(null,"ingrese nombre","persona "+1);
            pila.push(new Persona(i, nombre, edad));
        }
        
        
        
        System.out.println("\nultimo:"+pila.peek());
        System.out.println("Search: "+pila.search(new Persona(4, "Miguel", 12)));
        
        while (!pila.isEmpty()) {
            System.out.println("matando a"+ pila.pop());
            Thread.sleep(1000);
        }
    }
}
