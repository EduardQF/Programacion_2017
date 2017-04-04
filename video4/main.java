/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video4;

/**
 *
 * @author Eduard QF
 */
public class main {
    public static void main(String[] args) {
        Alumno al=new Alumno();
        Manzana man =new Manzana();
        
        if (al instanceof Alumno) {
            System.out.println("la persona ingresada es un alumno");
        }
        if (man instanceof Alumno) {
            System.out.println("es un alumno");
        }else{
            System.out.println("es una manzana");
        }
    }
}
