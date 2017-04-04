/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video7;

import video6.*;

/**
 *
 * @author Eduard QF
 */
public class Generico<K,T,V,E> {
    private T objectT;
    private K objectK;
    private E objectE;
    private V objectV;

    public Generico(K objetoK,T objetoT,V objetoV,E objetE) {
        this.objectT=objetoT;
        this.objectE=objetE;
        this.objectV=objetoV;
        this.objectK=objetoK;
    }
    
    public void mostrar(){
        System.out.println("K es un objeto de tipo"+objectK.getClass().getName());
        System.out.println("T es un objeto de tipo"+objectT.getClass().getName());
        System.out.println("V es un objeto de tipo"+objectV.getClass().getName());
        System.out.println("E es un objeto de tipo"+objectE.getClass().getName());
        
    }
}
