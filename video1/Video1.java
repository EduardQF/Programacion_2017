/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1;

/**
 *
 * @author Eduard QF
 */
public class Video1 {
    public static void main(String[] args) {
        for (String param: args) {
            System.out.println("Parametro "+ param);
        }
        if(args !=null){
        System.out.println(args[0]);
        System.out.println(args[args.length-1]);
        }
    }
}
