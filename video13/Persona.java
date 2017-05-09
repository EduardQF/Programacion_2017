/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video13;

import java.util.Objects;






/**
 *
 * @author Eduard QF
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this==obj)           
            return true;
        if (obj==null)           
            return false;
        if (getClass()!=obj.getClass())           
            return false;
        Persona other=(Persona)obj;
        if (nombre==null) {
            if (other.nombre!=null)           
            return false;
        }else if(!nombre.equals(other.nombre))          
            return false;
        return true;
    }

}
