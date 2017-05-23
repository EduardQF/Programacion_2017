/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video24;

import java.io.IOException;

/**
 *
 * @author Eduard QF
 */
public class AppExcepciones {
    public void mostrar(){
        try {
            throw new IOException("IOException");
        }catch(NullPointerException | IOException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        AppExcepciones app=new AppExcepciones();
        app.mostrar();
    }
}
