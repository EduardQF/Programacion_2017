/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video17;

import java.util.Stack;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        /*Stack<String> pila=new Stack<>();
        pila.push("1-MItoCode");
        pila.push("2-Mito");
        pila.push("3-Code");
        pila.push("4-Jaime");
        
        for (String element : pila) {
            System.out.println(element);
        }
         
        System.out.println("\nultimo:"+pila.peek());
        System.out.println("Search: "+pila.search("2-MItoCode"));
        
        System.out.println("LIFO");
        while (!pila.isEmpty()) {
            System.out.println("Atendiendo a"+ pila.pop());
            Thread.sleep(1000);
        }*/
        
        Stack<Persona>pila=new Stack<>();
        pila.push(new Persona(4, "Mitocode", 25));
        pila.push(new Persona(2, "Mito", 27));
        pila.push(new Persona(2, "Code", 27));
        pila.push(new Persona(1, "Jaime", 28));
        
        System.out.println("\nultimo:"+pila.peek());
        System.out.println("Search: "+pila.search(new Persona(4, "MitoCode", 25)));
    }
}
