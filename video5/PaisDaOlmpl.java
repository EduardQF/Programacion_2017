/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video5;

import java.util.List;

/**
 *
 * @author Eduard QF
 */
public class PaisDaOlmpl {
    public static PaisDaOlmpl instancia =null;
    
    public static PaisDaOlmpl getInstance(){
        if (instancia==null) {
            instancia=new PaisDaOlmpl();
            
        }
        return instancia;
    }
    private List paise;
    
    public List getPaises(){
        Paises p1=new Paises("Chile");
        Paises p2=new Paises("Argentina");
        Paises p3=new Paises("Brasil");
        
        paise.add(p1);
        paise.add(p2);
        paise.add(p3);
        return paise;
    }
}
