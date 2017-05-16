/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video19;

import java.util.ArrayDeque;
import java.util.Deque;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            dq.add(JOptionPane.showInputDialog("ingrese una palabra aleatoria"));
        }
        System.out.println("String original");
        for(String origin:dq){
            System.out.println(origin);
        }
               
        System.out.println("Peek: "+dq.peek());
        
        System.out.println("Poll: "+dq.poll());
        
        System.out.println("Poop: "+dq.pop());
        
        System.out.println("añadiendo al inicio y final correspondientemente");
        dq.addFirst("inicio");
        dq.addLast("final");
        for(String elemento :dq){
            System.out.println(elemento);
        }
    }
}
