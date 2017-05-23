/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video22;

import java.util.regex.Pattern;

/**
 *
 * @author Eduard QF
 */
public class App {
    public static void main(String[] args) {
        String patron="^[_A-Za-z0-9-\\+]+(\\.[_A-za-z0-9-]+)*@[_A-za-z0-9-]+(\\.[A-za-z0-9-])*(\\.[A-Za-z]{2,})$";
        long ini =System.currentTimeMillis();
        Pattern p=Pattern.compile(";");
        
        for (int i = 0; i < 10000; i++) {
            String[] arreglo=p.split("Jaime;Mitocode;Code;Mito");
        }
        long fin =System.currentTimeMillis();
        System.out.println(fin-ini);
        
        ////////////////////////////////////////////////////////////
        
        long iniSplit =System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            String[] arreglo="Jaime;Mitocode;Code;Mito".split(patron);
        }
        long finSplit =System.currentTimeMillis();
        System.out.println(finSplit-iniSplit);
        
    }
}
