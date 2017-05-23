/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    public static void main(String[] args) {
        String palabra=JOptionPane.showInputDialog(null,"ingrese palabra a buscar");
        String texto=JOptionPane.showInputDialog(null,"ingrese oracion en donde se buscara la palabra");
        Pattern p=Pattern.compile(palabra,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(texto);
        
        int coincidencias=0;
        while (m.find()) {
            coincidencias++;
            System.out.println("contador:"+coincidencias);
            System.out.println("ubicacion { inicio:"+m.start() +", final:"+m.end()+" }");
        }
        System.out.println("coincidencias encontradas: "+coincidencias);
    }
}
