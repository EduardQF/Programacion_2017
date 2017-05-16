/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Queue<Persona>cola=new PriorityQueue<>();
        cola.offer(new Persona(4, "Mitocode", 25));
        cola.offer(new Persona(2, "Mito", 27));
        cola.offer(new Persona(2, "Code", 27));
        cola.offer(new Persona(1, "Jaime", 28));
       
        while (!cola.isEmpty()) {
            System.out.println("Se procede a atender a "+ cola.peek());
            System.out.println("Atendiendo a "+cola.poll());
            Thread.sleep(1000);
        }
        
    }
}
