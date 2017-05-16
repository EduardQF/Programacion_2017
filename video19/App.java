/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video19;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        dq.add("1-Jaime");
        dq.add("2-Mito");
        dq.add("3-Code");
        
        String x =dq.peek();
        System.out.println("Peek "+x);
        
        x=dq.poll();
        System.out.println("Poll "+x);
        
        x=dq.pop();
        System.out.println("Poop "+x);
        
        dq.addFirst("0-MitoCode");
        dq.addLast("4-JCode");
        for(String elemento :dq){
            System.out.println(elemento);
        }
    }
}
