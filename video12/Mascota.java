/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video12;


/**
 *
 * @author Eduard QF
 */
public class Mascota implements Comparable {
    private String tipo;
    private String nombre;
    private int mesesDeEdad;

    public Mascota(String tipo, String nombre, int edad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.mesesDeEdad = edad;
    }

    public String getTipo() {
        return tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return mesesDeEdad;
    }

    @Override
    public int compareTo(Object o) {
       return this.tipo.compareTo(((Mascota)o).getTipo());
    }
    
}
