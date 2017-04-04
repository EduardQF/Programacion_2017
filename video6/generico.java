/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video6;

/**
 *
 * @author Eduard QF
 */
public class generico<T> {
    private T object;

    public generico(T objeto) {
        this.object=objeto;
    }
    
    public void mostrar(){
        System.out.println("T es un objeto de tipo"+object.getClass().getName());
    }
}
