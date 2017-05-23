/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class MyApp {
    
    public static void main(String[] args) {
        String patron="[a-z]{1,1}\\.{1,1}[a-z]*[0-9]{1,2}[@ufromail.cl]{1,1}";
        Pattern p=Pattern.compile(patron);
        String correo=JOptionPane.showInputDialog(null,"ingrese correo de la ufro a validar formato");
        Matcher m=p.matcher(correo);
        System.out.println("formato del correo: "+m.matches());
    }
}
