/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) throws InterruptedException {
         Queue<Integer>cola=new PriorityQueue<>();
         for (int i = 0; i < 10; i++) {
            cola.offer(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero entre 1 y 100")));
        }
         
         System.out.println("los numeros que usted a ingresados en orden son:");
         while(!cola.isEmpty()){
             System.out.println(cola.poll());
             Thread.sleep(1000);
         }
    }
}
