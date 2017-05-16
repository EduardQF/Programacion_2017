/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video21;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) {
        String cadena ="Jaime|Mitocode|Mito|Code";
        String[] extraccion=cadena.split("\\|",5);
        
        for(String elemento:extraccion){
            System.out.println(elemento);
        }
    }
}
