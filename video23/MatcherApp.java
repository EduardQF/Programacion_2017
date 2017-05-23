/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.CASE_INSENSITIVE;

/**
 *
 * @author Eduard QF
 */
public class MatcherApp {
    public static void main(String[] args) {
        String texto="Suscribete al canal de Mitocode, suscribete";
        Pattern p=Pattern.compile("suscribete",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(texto);
        System.out.println(m.matches());
        System.out.println("lookingAt " +m.lookingAt());
        
        int contador=0;
        while(m.find()){
            contador++;
            System.out.println("Coincidencia Nº contador"+ contador+" star "+m.start()+" end "+m.end());
        }
    }
}
